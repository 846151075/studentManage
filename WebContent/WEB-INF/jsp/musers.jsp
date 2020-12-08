<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<style type="text/css">
	 
</style>
 <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<base href="<%=basePath %>" />	
<script type="text/javascript" src="static/js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="static/js/main.js"></script> 
<script type="text/javascript" src="static/js/bootstrap-table.min.js"></script> 
<link rel="stylesheet" href="https://unpkg.com/bootstrap-table@1.18.0/dist/bootstrap-table.min.css">
</head>
<body>
<div style="text-align: center; line-height: center">
	<h1 style="">用户管理</h1><input type="text" id="search"><input type="button" value="搜索" onclick="search()">&nbsp;&nbsp;<a href="musers">刷新</a>
	<%-- <table border="1" cellspacing="0" style="margin: auto;">
		<thead>
			<th>
				id
			</th>
			<th>
				用户名
			</th>
			<th>
				密码
			</th>
			<th>
				修改
			</th>
			<th>
				删除
			</th>
		</thead>
		<tbody>			
			<c:forEach items="${list}" var="user" varStatus="index"> 
				<tr>
					<td>${index.index + 1 }</td>
					<td>${user.username}</td>					
					<td>${user.password }</td>
					<td><a href="updateUserView/${user.id} ">修改</a></td>
					<td><a href="deleteUser/${user.id }">删除</a></td>
				</tr>			     
			</c:forEach>	
		</tbody>
	</table>	 --%>
<table class="table table-bordered">
  <thead>
    <tr>
      <th>索引</th>
      <th>用户名</th>
      <th>密码</th>
      <th>操作</th>
    </tr>
  </thead>
  <tbody>
		<c:forEach items="${list}" var="user" varStatus="index"> 
		<tr>
			<td>${index.index + 1 }</td>
			<td>${user.username}</td>					
			<td>${user.password }</td>
			<td><a href="updateUserView/${user.id} ">修改</a> &nbsp; <a href="deleteUser/${user.id }">删除</a></td>			
		</tr>			     
		</c:forEach>	   
  </tbody>
</table>
</div>
<script>
$('#table').bootstrapTable({
	  columns: [{
	    field: 'id',
	    title: 'Item ID'
	  }, {
	    field: 'name',
	    title: 'Item Name'
	  }, {
	    field: 'price',
	    title: 'Item Price'
	  }],
	  data: [{
	    id: 1,
	    name: 'Item 1',
	    price: '$1'
	  }, {
	    id: 2,
	    name: 'Item 2',
	    price: '$2'
	  }]
	})
	function search(){
		location.href="search?search="+$("#search").val();
	}
</script>
</body>
</html>