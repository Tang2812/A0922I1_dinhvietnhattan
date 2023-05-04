<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 12-Apr-23
  Time: 8:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/static/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<form action ="/UserServlet?action=edit" method="post">
    <h1>Thong tin Nguoi dung</h1>
    <input type="hidden" name="id" value="${user.id}">
    <b</b>
    <input  type="text" name="userName" value="${user.name}">
    <input  type="text" name="userMail" value="${user.email}">
    <input  type="text" name="userCountry" value="${user.country}">
    <a href="/product">back</a>   <button class="btn btn-success" role="button" type="submit">Edit</button>
</form>
</body>
</html>

