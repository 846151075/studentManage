<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<base href="<%=basePath %>" />	
</head>
<body>
<div style="content: center;text-align: center;">
	<h1>用户修改</h1>
	<table style="margin: auto;">
		<tbody>
		<form action="updateUser" method="post">
			<tr>
				<input type="text" hidden name="id" value="${user.id }">
				<td>用户名：<input type="text"    name="username" value="${user.username }"></td>
			</tr>
			<tr> 
				<td>密码：  <input type="text"   name="password" value="${user.password }"></td>				
			</tr>
			<tr>
				<td><input type="submit" value="修改"></td>		
						
			</tr>
		</form>
			
		</tbody>
	</table><a href="musers">返回页面管理</a>
	
</div>
</body>
</html>