<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 12-Apr-23
  Time: 6:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/static/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form action="/product?action=remove" method="post">
        <h1>Remove a Product</h1>
        <input type="text" name="productId">
        <button class="btn btn-success" role="button" type="submit">remove</button>
    </form>
</div>
</body>
</html>
