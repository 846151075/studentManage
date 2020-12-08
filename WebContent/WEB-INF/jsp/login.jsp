<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<base href="<%=basePath %>" />	
</head>
<body>
<form action="login" method="post" style="text-align: center" autocomplete="false">
	<table style="margin: auto;"> 
	<h1>用户登录</h1>
		<tr>
			<td>用户名<input  name="username" type="text" value=""></td>			
		</tr>		 
		<tr>
			<td>密码<input name="password" type="password" ></td>
		</tr>	
		<tr>
			<td><input type="submit" value="登录">	</td>
		</tr>	
	</table>
</form>
</body>
</html> -->
<!DOCTYPE html>
<html class="loginHtml">
<head>
	<meta charset="utf-8">
	<title>登录</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<base href="<%=basePath %>" />	
	<link rel="icon" href="static/images/favicon.ico">
	<link rel="stylesheet" href="static/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="static/css/public.css" media="all" />
</head>
<body class="loginBody">
	<form class="layui-form" action="login" method="post" autocomplete="off">
		<div class="login_face"><img src="static/images/face.jpg" class="userAvatar"></div>
		<div class="layui-form-item input-item">
			<label for="username">用户名</label>
			<input type="text" placeholder="请输入用户名" autocomplete="off" id="userName" name="username" class="layui-input" lay-verify="required">
		</div>
		<div class="layui-form-item input-item">
			<label for="password">密码</label>
			<input type="password" placeholder="请输入密码" autocomplete="off" name="password" class="layui-input" lay-verify="required">
		</div>
		
		<div class="layui-form-item">
			<button class="layui-btn layui-block" lay-filter="login" type="submit" lay-submit>登录</button>
		</div>			
	</form>
	<script type="text/javascript" src="static/layui/layui.js"></script>
	<script type="text/javascript">
	
	
	layui.use(['form','layer','jquery'],function(){
	    var form = layui.form,
	        layer = parent.layer === undefined ? layui.layer : top.layer
	        $ = layui.jquery;

	    $(".loginBody .seraph").click(function(){
	        layer.msg("注册吧",{
	            time:5000
	        });
	    })

	    //登录按钮
	    /* form.on("submit(login)",function(data){
	        $(this).text("登录中...").attr("disabled","disabled").addClass("layui-disabled");
	         location.href="login?username=test&password=test" 
	         setTimeout(function(){
	            window.location.href = "login/index.html";
	        },1000); 
	         return false;
	    }) */

	    //表单输入效果
	    $(".loginBody .input-item").click(function(e){
	        e.stopPropagation();
	        $(this).addClass("layui-input-focus").find(".layui-input").focus();
	    })
	    $(".loginBody .layui-form-item .layui-input").focus(function(){
	        $(this).parent().addClass("layui-input-focus");
	    })
	    $(".loginBody .layui-form-item .layui-input").blur(function(){
	        $(this).parent().removeClass("layui-input-focus");
	        if($(this).val() != ''){
	            $(this).parent().addClass("layui-input-active");
	        }else{
	            $(this).parent().removeClass("layui-input-active");
	        }
	    })
	})
	
	</script>
	<script type="text/javascript" src="static/js/cache.js"></script>
</body>
</html>