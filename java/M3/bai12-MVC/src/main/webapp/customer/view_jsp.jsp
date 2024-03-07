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
<form action ="/CustomerServlet?action=View" method="post"></form>
<h1>Thong tin khach hang</h1>
<input readonly type="text" name="customerTen" value="${customer.ten}">
<input readonly type="text" name="customerTen" value="${customer.tuoi}">
<input readonly type="text" name="customerTen" value="${customer.quequan}">
<a href="/CustomerServlet">back</a>
</body>
</html>
