<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>信息管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>
<link href="style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="scripts/jquery/jquery-1.4.4.min.js"></script>
<script src="scripts/My97DatePicker/WdatePicker.js" type="text/javascript" defer="defer"></script>
<script type="text/javascript" src="scripts/artDialog/artDialog.js?skin=default"></script>
<script type="text/javascript">

	function checkForm() {
		var workername = document.getElementById("worker_name").value;
		if(workername==null || workername=='') {
			document.getElementById("span1").innerHTML = "<font color='red'>用户名不能为空！</font>";
			return false;
		}
		var password = document.getElementById("worker_pwd").value;
		if(password==null || password=='') {
			document.getElementById("spanPwd").innerHTML = "<font color='red'>密码不能为空！</font>";
			return false;
		}else{
			document.getElementById("spanPwd").innerHTML = "";
		}
		var repassword = document.getElementById("repassword").value;
		if(repassword != password) {
			document.getElementById("spanPwd2").innerHTML = "<font color='red'>密码不一致</font>";
			return false;
		}else{
			document.getElementById("spanPwd2").innerHTML = "";
		}
		//checkUsername();
		if(document.getElementById("span1").innerText=="用户名已存在") {
			return false;
		}
		if(document.getElementById("spanTel").innerText=="手机号码有误") {
			return false;
		}
	}

	function checkUsername() {
		var workername = $("#worker_name").val();
		if(workername==null || workername=='') {
			document.getElementById("span1").innerHTML = "<font color='red'>用户名不能为空！</font>";
			return false;
		}else {
		    $.ajax({
		        type:"POST",   //http请求方式
		        url: "${pageContext.request.contextPath}/findByWorkername.action", //发送给服务器的url
		        data:"workername="+workername, //发送给服务器的参数
		         //告诉JQUERY返回的数据格式(注意此处数据格式一定要与提交的controller返回的数据格式一致,不然不会调用回调函数complete)
		        success:function(msg) {
						$("#span1").html(msg);
		        }//定义交互完成,并且服务器正确返回数据时调用回调函数 
		    });
	    }
	}

	function checkPhone(){ 
	    var phone = document.getElementById('workerTel').value;
	    if(!(/^1[34578]\d{9}$/.test(phone))){ 
	    	document.getElementById("spanTel").innerHTML = "<font color='red'>手机号码有误</font>";
	        return false; 
	    } 
	}

	$(document).ready(function() {
		/*
		 * 提交
		 */
		$("#submitbutton").click(function() {
			/*if(validateForm()){
				checkFyFhSubmit();
			}*/
			window.location.href="${pageContext.request.contextPath }/regist.action";
		});
		
		/*
		 * 取消
		 */
		$("#cancelbutton").click(function() {
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		});
		
		var result = 'null';
		if(result =='success'){
			/**  关闭弹出iframe  **/
			window.parent.$.fancybox.close();
		}
	});
	
	/** 检测房源房号是否存在  **/
	function checkFyFh(){
		// 分别获取小区编号、栋号、层号、房号
		var fyID = $('#fyID').val();
		var fyXqCode = $("#fyXq").val();
		var fyDh = $("#fyDh").val();
		var fyCh = $("#fyCh").val();	
		var fyFh = $("#fyFh").val();
		if(fyXqCode!="" && fyDh!="" && fyCh!="" && fyFh!=""){
			// 给房屋坐落地址赋值
			$("#fyZldz").val($('#fyDh option:selected').text() + fyCh + "-" + fyFh);
			// 异步判断该房室是否存在，如果已存在，给用户已提示哦
			$.ajax({
				type:"POST",
				url:"checkFyFhIsExists.action",
				data:{"fangyuanEntity.fyID":fyID,"fangyuanEntity.fyXqCode":fyXqCode, "fangyuanEntity.fyDhCode":fyDh, "fangyuanEntity.fyCh":fyCh, "fangyuanEntity.fyFh":fyFh},
				dataType : "text",
				success:function(data){
// 					alert(data);
					// 如果返回数据不为空，更改“房源信息”
					if(data=="1"){
						 art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'该房室在系统中已经存在哦，\n请维护其他房室数据', ok:true,});
						 $("#fyFh").css("background", "#EEE");
						 $("#fyFh").focus();
						 return false;
					}
				}
			});
		}
	}
	
	/** 检测房源房号是否存在并提交form  **/
	function checkFyFhSubmit(){
		// 分别获取小区编号、栋号、层号、房号
		var fyID = $('#fyID').val();
		var fyXqCode = $("#fyXq").val();
		var fyDh = $("#fyDh").val();
		var fyCh = $("#fyCh").val();	
		var fyFh = $("#fyFh").val();
		if(fyXqCode!="" && fyDh!="" && fyCh!="" && fyFh!=""){
			// 给房屋坐落地址赋值
			$("#fyZldz").val($('#fyDh option:selected').text()  + fyCh + "-" + fyFh);
			// 异步判断该房室是否存在，如果已存在，给用户已提示哦
			$.ajax({
				type:"POST",
				url:"checkFyFhIsExists.action",
				data:{"fangyuanEntity.fyID":fyID,"fangyuanEntity.fyXqCode":fyXqCode, "fangyuanEntity.fyDhCode":fyDh, "fangyuanEntity.fyCh":fyCh, "fangyuanEntity.fyFh":fyFh},
				dataType : "text",
				success:function(data){
// 					alert(data);
					// 如果返回数据不为空，更改“房源信息”
					if(data=="1"){
						 art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'该房室在系统中已经存在哦，\n请维护其他房室数据', ok:true,});
						 $("#fyFh").css("background", "#EEE");
						 $("#fyFh").focus();
						 return false;
					}else{
						$("#submitForm").attr("action", "/xngzf/archives/saveOrUpdateFangyuan.action").submit();
					}
				}
			});
		}
		return true;
	}
	
	/** 表单验证  **/
	function validateForm(){
		if($("#fyXqName").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源小区', ok:true,});
			return false;
		}
		if($("#fyDh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源栋号', ok:true,});
			return false;
		}
		if($("#fyCh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源层号', ok:true,});
			return false;
		}
		if($("#fyFh").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源房号', ok:true,});
			return false;
		}
		if($("#fyZongMj").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源面积', ok:true,});
			return false;
		}
		if($("#fyJizuMj").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写计租面积', ok:true,});
			return false;
		}
		if($("#fyZldz").val()==""){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'填写房源座落地址', ok:true,});
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<form id="submitForm" name="submitForm" action="${pageContext.request.contextPath }/regist.action" method="post" onsubmit="return checkForm()">
	<input type="hidden" name="fyID" value="14458625716623" id="fyID"/>
	<div id="container">
		<div id="nav_links">
			当前位置：基础数据&nbsp;>&nbsp;<span style="color: #1A5CC6;">新增飞人</span>
			<div id="page_close">
				<a href="javascript:parent.$.fancybox.close();">
					<img src="images/common/page_close.png" width="20" height="20" style="vertical-align: text-top;"/>
				</a>
			</div>
		</div>
		<div class="ui_content">
			<table  cellspacing="0" cellpadding="0" width="100%" align="left" border="0">
				<tr>
					<td class="ui_text_rt" width="80">用户名</td>
					<td class="ui_text_lt">
						<input type="text" id="worker_name" name="worker_name" class="ui_input_txt02" onblur="checkUsername()"/>
						<span id="span1"></span>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">密码</td>
					<td class="ui_text_lt">
						<input type="password" id="worker_pwd" name="worker_pwd" class="ui_input_txt02"/>
						<span id="spanPwd"></span>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">确认密码</td>
					<td class="ui_text_lt">
						<input type="password" id="repassword" name="repassword" class="ui_input_txt02"/>
						 <span id="spanPwd2"></span>
					</td>
				</tr>
				<tr>
					<td class="ui_text_rt">手机号码</td>
					<td class="ui_text_lt">
						<input type="text" id="workerTel" name="workerTel" class="ui_input_txt02" onblur="checkPhone()"/>
						<span id="spanTel"></span>
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;</td>
					<td class="ui_text_lt">
						&nbsp;<input id="submitbutton" type="button" value="提交" class="ui_input_btn01"/>
						&nbsp;<input id="cancelbutton" type="button" value="取消" class="ui_input_btn01"/>
					</td>
				</tr>
			</table>
		</div>
	</div>
</form>

</body>
</html>
