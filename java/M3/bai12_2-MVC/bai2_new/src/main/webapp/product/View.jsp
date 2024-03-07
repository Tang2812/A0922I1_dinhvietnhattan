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
<form action ="/product?action=view" method="post"></form>
<h1>Thong tin khach hang</h1>
<input readonly type="text" name="productName" value="${product.name}">
<input readonly type="text" name="productPrice" value="${product.price}">
<input readonly type="text" name="productStatus" value="${product.status}">
<input readonly type="text" name="productProducer" value="${product.producer}">
<a href="/product">back</a>
</body>
</html>
