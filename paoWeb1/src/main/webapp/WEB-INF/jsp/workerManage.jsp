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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="scripts/jquery/jquery-1.7.1.js"></script>
<link href="style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="scripts/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript" src="scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="style/authority/jquery.fancybox-1.3.4.css" media="screen"></link>
<script type="text/javascript" src="scripts/artDialog/artDialog.js?skin=default"></script>
<title>信息管理系统</title>
<script type="text/javascript">
	$(document).ready(function(){
		/** 新增   **/
	    $("#addBtn").fancybox({
	    	'href'  : "${pageContext.request.contextPath}/addWorkerPage.action",
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	//window.location.href = "${pageContext.request.contextPath}/showWorkerMsg.action?page=1";
	        }
	    }); 
		
	    /** 导入  
	    $("#importBtn").fancybox({
	    	'href'  : '/xngzf/archives/importFangyuan.action',
	    	'width' : 633,
	        'height' : 260,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'house_list.html';
	        }
	    }); **/
		
	    /**编辑   **/
	    $("a.edit").fancybox({
	    	'width' : 733,
	        'height' : 530,
	        'type' : 'iframe',
	        'hideOnOverlayClick' : false,
	        'showCloseButton' : false,
	        'onClosed' : function() { 
	        	window.location.href = 'house_list.html';
	        }
	    });
	});
	/** 用户角色   **/
	var userRole = '';

	/** 模糊查询用户  **/
	function search(){
		$("#submitForm").attr("action", "${pageContext.request.contextPath}/searchWorker.action?page=1&workerName=" + $("#searchName").val()).submit();
	}

	/** 新增   **/
	function add(){
		$("#submitForm").attr("action", "/xngzf/archives/luruFangyuan.action").submit();	
	}
	 
	/** Excel导出  
	function exportExcel(){
		if( confirm('您确定要导出吗？') ){
			var fyXqCode = $("#fyXq").val();
			var fyXqName = $('#fyXq option:selected').text();
//	 		alert(fyXqCode);
			if(fyXqCode=="" || fyXqCode==null){
				$("#fyXqName").val("");
			}else{
//	 			alert(fyXqCode);
				$("#fyXqName").val(fyXqName);
			}
			$("#submitForm").attr("action", "/xngzf/archives/exportExcelFangyuan.action").submit();	
		}
	} **/
	
	/** 删除 **/
	function del(userId){
		// 非空判断
		if(userId == '') return;
		if(confirm("您确定要删除吗？")){
			$("#submitForm").attr("action", "${pageContext.request.contextPath}/delWorker.action?workerId=" + workerId).submit();			
		}
	}
	
	function delById(id){
		// 非空判断
		if(id == '') return;
		if(confirm("您确定要删除吗？")){
			 $.ajax({
				    type:"post",
				    url:"${pageContext.request.contextPath}/delWorker.action",
				    data:"workerId=" + id,
				    success:function(data){
				        alert("删除成功");
				        //window.location.reload();
				        window.location.href="${pageContext.request.contextPath}/showWorkerMsg.action?page=1";
				    }
				})
		}
	}
	
	/** 批量删除 **/
	function batchDel(){
		if($("input[name='IDCheck']:checked").size()<=0){
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'至少选择一条', ok:true,});
			return;
		}
		// 1）取出用户选中的checkbox放入字符串传给后台,form提交
		var allIDCheck = "";
		$("input[name='IDCheck']:checked").each(function(index, domEle){
			bjText = $(domEle).parent("td").parent("tr").last().children("td").last().prev().text();
// 			alert(bjText);
			// 用户选择的checkbox, 过滤掉“已审核”的，记住哦
			if($.trim(bjText)=="已审核"){
// 				$(domEle).removeAttr("checked");
				$(domEle).parent("td").parent("tr").css({color:"red"});
				$("#resultInfo").html("已审核的是不允许您删除的，请联系管理员删除！！！");
// 				return;
			}else{
				allIDCheck += $(domEle).val() + ",";
			}
		});
		// 截掉最后一个","
		if(allIDCheck.length>0) {
			allIDCheck = allIDCheck.substring(0, allIDCheck.length-1);
			// 赋给隐藏域
			$("#allIDCheck").val(allIDCheck);
			if(confirm("您确定要批量删除这些记录吗？")){
				// 提交form
				$("#submitForm").attr("action", "/xngzf/archives/batchDelFangyuan.action").submit();
			}
		}
	}
	
	/** 批量删除  **/
	function batchDelById(){
			var length = $("input[name='workerId']:checked").length;
		        if (length == 0) {
		            alert("请选择删除项!");
		            return false;
		       	}
		 	var msg = "您确定要删除这些记录吗？";   
	        if (confirm(msg)==true){   
	            var allcheckbox = "";
	            var becheckbox = "";
	            $("input[name=workerId]").each(function(){ //遍历table里的全部checkbox
	                allcheckbox += $(this).val() + ","; //获取所有checkbox的值
	                if($(this).attr("checked")) //如果被选中
	                    becheckbox += $(this).val() + ","; //获取被选中的值
	            });
	            if(becheckbox.length > 0) //如果获取到
	                becheckbox = becheckbox.substring(0, becheckbox.length - 1); //把最后一个逗号去掉
	                /*window.location = "${pageContext.request.contextPath}/batchDelUser.action?"+becheckbox;*/
	                $.ajax({
					    type:"post",
					    url:"${pageContext.request.contextPath}/batchDelWorker.action",
					    data:"workerIds=" + becheckbox,
					    success:function(data){
					        alert("删除成功");
					        window.location.href="${pageContext.request.contextPath}/showWorkerMsg.action?page=1";
					    }
					});
	        }else{   
	       		return false;   
	        }   
	}

	/** 普通跳转 **/
	function jumpNormalPage(page, flag){
		if(flag == null || flag == ""){
			$("#submitForm").attr("action", "${pageContext.request.contextPath}/showWorkerMsg.action?page=" + page).submit();
		}else{
			//alert("sasdasd");
			$("#submitForm").attr("action", "${pageContext.request.contextPath}/searchWorker.action?page=" + page + "&workerName=" + flag).submit();
		}
		
	}
	
	/** 输入页跳转 **/
	function jumpInputPage(totalPage, flag){
		// 如果“跳转页数”不为空
		if($("#jumpNumTxt").val() != ''){
			var pageNum = parseInt($("#jumpNumTxt").val());
			// 如果跳转页数在不合理范围内，则置为1
			if(pageNum<1 | pageNum>totalPage){
				art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'请输入合适的页数', ok:true,});
				//alert("请输入合适的页数，\n自动为您跳到首页");
				//pageNum = 1;
				return false;
			}
			if(flag == null || flag == ""){
				$("#submitForm").attr("action", "${pageContext.request.contextPath}/showWorkerMsg.action?page=" + pageNum).submit();
			}else{
				//alert("sasdasd");
				$("#submitForm").attr("action", "${pageContext.request.contextPath}/searchWorker.action?page=" + pageNum + "&workerName=" + flag).submit();
			}
			//$("#submitForm").attr("action", "house_list.html?page=" + pageNum).submit();
		}else{
			// “跳转页数”为空
			art.dialog({icon:'error', title:'友情提示', drag:false, resize:false, content:'请输入合适的页数', ok:true,});
			/*if(flag == null || flag == ""){
				$("#submitForm").attr("action", "${pageContext.request.contextPath}/showUserMsg.action?page=" + 1).submit();
			}else{
				//alert("sasdasd");
				$("#submitForm").attr("action", "${pageContext.request.contextPath}/searchUser.action?page=" + 1 + "&userName=" + flag).submit();
			}*/
			//$("#submitForm").attr("action", "house_list.html?page=" + 1).submit();
		}
	}
</script>
<style>
	.alt td{ background:black !important;}
</style>
</head>
<body>
	<form id="submitForm" name="submitForm" action="" method="post">
		<input type="hidden" name="allIDCheck" value="" id="allIDCheck"/>
		<input type="hidden" name="fangyuanEntity.fyXqName" value="" id="fyXqName"/>
		<div id="container">
			<div class="ui_content">
				<div class="ui_text_indent">
					<div id="box_border">
						<div id="box_top">搜索</div>
						<div id="box_center">
							<!-- 小区
							<select name="fangyuanEntity.fyXqCode" id="fyXq" class="ui_select01" onchange="getFyDhListByFyXqCode();">
                                <option value=""
                                >--请选择--</option>
                                <option value="6">瑞景河畔</option>
                                <option value="77">蔚蓝小区</option>
                                <option value="83">和盛园小区</option>
                            </select>

							栋号
							<select name="fangyuanEntity.fyDhCode" id="fyDh" class="ui_select01">
                                <option value="">--请选择--</option>
                            </select>
							户型
							<select name="fangyuanEntity.fyHxCode" id="fyHx" class="ui_select01">
                                <option value="">--请选择--</option>
                                <option value="76">一室一厅一卫</option>
                                <option value="10">两室一厅一卫</option>
                                <option value="14">三室一厅一卫</option>
                                <option value="71">三室两厅一卫</option>
                            </select>
							状态
							<select name="fangyuanEntity.fyStatus" id="fyStatus" class="ui_select01">
                                <option value="">--请选择--</option>
                                <option value="26">在建</option>
                                <option value="25">建成待租</option>
                                <option value="13">已配租</option>
                                <option value="12">已租赁</option>
                                <option value="24">腾退待租</option>
                                <option value="23">欠费</option>
                                <option value="27">其他</option>
                            </select> -->

							用户名&nbsp;&nbsp;<input type="text" id="searchName" class="ui_input_txt02" />
						</div>
						<div id="box_bottom">
							<input type="button" value="查询" class="ui_input_btn01" onclick="search()" /> 
							<input type="button" value="新增" class="ui_input_btn01" id="addBtn" />
							<input type="button" value="删除" class="ui_input_btn01" onclick="batchDelById();" /> 
							<!-- <input type="button" value="导入" class="ui_input_btn01" id="importBtn" /> -->
							<!-- <input type="button" value="导出" class="ui_input_btn01" onclick="exportExcel();" /> -->
						</div>
					</div>
				</div>
			</div>
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th width="30"><input type="checkbox" id="all" onclick="selectOrClearAllCheckbox(this);" />
							</th>
							<th>序号</th>
							<th>用户名</th>
							<th>手机号码</th>
							<th>信用等级</th>
							<th>最近登录时间</th>
							<th>上次登录时间</th>
							<th>操作</th>
						</tr>
						<c:forEach items="${pageBean.list}" var="worker" varStatus="status">
							<tr>
									<td><input type="checkbox" name="workerId" value="${worker.workerId }" class="acb" /></td>
									<td>${status.count }</td>
									<td>${worker.workerName }</td>
									<td>${worker.workerTel }</td>
									<td>${worker.workerCreditsNum }</td>
									<td><fmt:formatDate value="${worker.workerThisLoginTime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
									<td><fmt:formatDate value="${worker.workerLastLoginTime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
									<td>
										<!-- <a href="house_edit.html?fyID=14458579642011" class="edit">编辑</a> --> 
										<a href="javascript:delById(${worker.workerId });">删除</a>
									</td>
							</tr>
						</c:forEach>
							
						
					</table>
				</div>
				<div class="ui_tb_h30">
					<div class="ui_flt" style="height: 30px; line-height: 30px;">
						共有
						<span class="ui_txt_bold04">${pageBean.totalCount }</span>
						条记录，当前第
						<span class="ui_txt_bold04">${pageBean.page }
						/
						${pageBean.totalPage }</span>
						页
					</div>
					<div class="ui_frt">
					<c:choose>
						<c:when test="${pageBean.page==1 && pageBean.page==pageBean.totalPage }">
						
						</c:when>
						<c:when test="${pageBean.page==1}">
							<input type="button" value="下一页" class="ui_input_btn01"
								onclick="jumpNormalPage(${pageBean.page }+1, '${pageBean.flag}')" />
							<input type="button" value="尾页" class="ui_input_btn01"
								onclick="jumpNormalPage(${pageBean.totalPage }, '${pageBean.flag }');" />
						</c:when>
						<c:when test="${pageBean.page==pageBean.totalPage}">
							<input type="button" value="首页" class="ui_input_btn01" 
								onclick="jumpNormalPage(1, '${pageBean.flag }');"/>
							<input type="button" value="上一页" class="ui_input_btn01" 
								onclick="jumpNormalPage(${pageBean.page }-1, '${pageBean.flag }');"/>
						</c:when>
						<c:otherwise>
							<input type="button" value="首页" class="ui_input_btn01" 
								onclick="jumpNormalPage(1, '${pageBean.flag }');"/>
							<input type="button" value="上一页" class="ui_input_btn01" 
								onclick="jumpNormalPage(${pageBean.page }-1, '${pageBean.flag }');"/>
							<input type="button" value="下一页" class="ui_input_btn01"
								onclick="jumpNormalPage(${pageBean.page }+1, '${pageBean.flag }');" />
							<input type="button" value="尾页" class="ui_input_btn01"
								onclick="jumpNormalPage(${pageBean.totalPage }, '${pageBean.flag }');" />
						</c:otherwise>
					</c:choose>
						转到第<input type="text" id="jumpNumTxt" class="ui_input_txt01" />页
							 <input type="button" class="ui_input_btn01" value="跳转" onclick="jumpInputPage('${pageBean.totalPage }', '${pageBean.flag }');" />
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>
