<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head>
<title>登录</title> 
<meta name="keywords" content="网站模板下载,网站后台登录模板,后台登录模板HTML,后台模板登录,后台登录模板下载" />
<meta name="description" content="JS代码网提供大量的网站后台模板下载以及手机网站模板下载" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/images/login.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<link href="${pageContext.request.contextPath}/css/login2.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function checkForm1() {
		var username = document.getElementById("username").value;
		if(username==null || username=='') {
			document.getElementById("span3").innerHTML = "<font color='red'>请输入用户名！</font>";
			return false;
		}else{
			document.getElementById("span3").innerHTML = "";
		}
		var password = document.getElementById("password").value;
		if(password==null || password=='') {
			document.getElementById("span4").innerHTML = "<font color='red'>请输入密码！</font>";
			return false;
		}else{
			document.getElementById("span4").innerHTML = "";
		}
	}

	function checkForm() {
		var username = document.getElementById("user_name").value;
		if(username==null || username=='') {
			document.getElementById("span1").innerHTML = "<font color='red'>用户名不能为空！</font>";
			return false;
		}
		var password = document.getElementById("user_pwd").value;
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
	}
	
	function checkUsername() {
		var username = $("#user_name").val();
		if(username==null || username=='') {
			document.getElementById("span1").innerHTML = "<font color='red'>用户名不能为空！</font>";
			return false;
		}else {
		    $.ajax({
		        type:"POST",   //http请求方式
		        url: "${pageContext.request.contextPath}/findByUsername.action", //发送给服务器的url
		        data:"username="+username, //发送给服务器的参数
		         //告诉JQUERY返回的数据格式(注意此处数据格式一定要与提交的controller返回的数据格式一致,不然不会调用回调函数complete)
		        success:function(msg) {
						$("#span1").html(msg);
		        }//定义交互完成,并且服务器正确返回数据时调用回调函数 
		    });
	    }
	}
</script>
</head>
<body>
<h1>登录<sup>shop</sup></h1>

<div class="login" style="margin-top:50px;">
    
    <div class="header">
        <div class="switch" id="switch"><a class="switch_btn_focus" id="switch_qlogin" href="javascript:void(0);" tabindex="7">快速登录</a>
			<a class="switch_btn" id="switch_login" href="javascript:void(0);" tabindex="8">快速注册</a><div class="switch_bottom" id="switch_bottom" style="position: absolute; width: 64px; left: 0px;"></div>
        </div>
    </div>    
  
    
    <div class="web_qr_login" id="web_qr_login" style="display: block; height: 235px;">    

            <!--登录-->
            <div class="web_login" id="web_login">
               
               
               <div class="login-box">
    
            
			<div class="login_form">
				<form action="${pageContext.request.contextPath }/login.action" name="loginform" accept-charset="utf-8" id="login_form" class="loginForm" method="post" onsubmit= "return checkForm1()"><input type="hidden" name="did" value="0" />
               <input type="hidden" name="to" value="log"/>
                <div class="uinArea" id="uinArea">
                <label class="input-tips" for="u">帐号：</label>
                <div class="inputOuter" id="uArea">
                    
                    <input type="text" id="username" name="username" class="inputstyle"/>
                    <span id="span3"></span>
                </div>
                </div>
                <div class="pwdArea" id="pwdArea">
               <label class="input-tips" for="p">密码：</label> 
               <div class="inputOuter" id="pArea">
                    
                    <input type="password" id="password" name="password" class="inputstyle"/>
                    <span id="span4"></span>
                </div>
                </div>
               	<span id="span6"><font color="red">${errorMsg}</font></span>
                <div style="padding-left:50px;margin-top:20px;"><input type="submit" value="登 录" style="width:150px;" class="button_blue"/></div>
              </form>
           </div>
           
            	</div>
               
            </div>
            <!--登录end-->
  </div>

  <!--注册-->
    <div class="qlogin" id="qlogin" style="display: none; ">
   
    <div class="web_login"><form name="form2" id="regUser" accept-charset="utf-8"  method="post" action="${pageContext.request.contextPath }/regist.action" onsubmit="return checkForm()"> 
	      <input type="hidden" name="to" value="reg"/>
		      		       <input type="hidden" name="did" value="0"/>
        <ul class="reg_form" id="reg-ul">
                <li>
                	
                    <label for="user"  class="input-tips2">用户名：</label>
                    <div class="inputOuter2">
                        <input type="text" id="user_name" name="user_name" maxlength="16" class="inputstyle2" onblur="checkUsername()"/>
                        <span id="span1"></span>
                    </div>
                    
                </li>
                
                <li>
                <label for="passwd" class="input-tips2">密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="user_pwd"  name="user_pwd" maxlength="16" class="inputstyle2"/>
                        <span id="spanPwd"></span>
                    </div>
                    
                </li>
                <li>
                <label for="passwd2" class="input-tips2">确认密码：</label>
                    <div class="inputOuter2">
                        <input type="password" id="repassword" name="repassword" maxlength="16" class="inputstyle2" />
                        <span id="spanPwd2"></span>
                    </div>
                    
                </li>
                
                <li>
                    <div class="inputArea">
                        <input type="submit" id="reg"  style="margin-top:10px;margin-left:85px;" class="button_blue" value="注册"/> 
                    </div>
                    
                </li><div class="cl"></div>
            </ul></form>
           
    
    </div>
   
    
    </div>
    <!--注册end-->
</div>
<div class="jianyi">*推荐使用ie8或以上版本ie浏览器或Chrome内核浏览器访问本站</div>
</body></html>