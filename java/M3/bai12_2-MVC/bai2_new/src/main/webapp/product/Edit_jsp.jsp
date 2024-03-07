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
<form action ="/product?action=edit" method="post">
<h1>Thong tin San Pham</h1>
    <input type="hidden" name="id" value="${product.id}">
<input  type="text" name="productName" value="${product.name}">
<input  type="text" name="productPrice" value="${product.price}">
<input  type="text" name="productStatus" value="${product.status}">
<input  type="text" name="productProducer" value="${product.producer}">
<a href="/product">back</a>   <button class="btn btn-success" role="button" type="submit">Edit</button>
</form>
</body>
</html>

