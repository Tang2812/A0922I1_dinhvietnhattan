<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 11-Apr-23
  Time: 9:28 PM
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
  <div class="row justify-content-center mt-4">
    <form class="col-md-6" action="/product?action=create" method="post">


      <h1 class="">Create new product</h1>
<%--ID--%>
<%--      <div class="form-group">--%>
<%--        <label for="txtName">Id</label>--%>
<%--        <input type="text" class="form-control" name="productId" id="txtId">--%>
<%--      </div>--%>
<%--      Name--%>
      <div class="form-group">
        <label for="txtName">Name</label>
        <input type="text" class="form-control" name="productName" id="txtName">
      </div>
<%--      Price--%>
      <div class="form-group">
        <label for="txtPrice">Price</label>
        <input type="number" class="form-control" name="productPrice" id="txtPrice">
      </div>
<%--      Status--%>
      <div class="form-group">
        <label for="txtStatus">Status</label>
        <input type="text" class="form-control" name="productStatus" id="txtStatus">
      </div>
<%--      Producer--%>
        <div class="form-group">
            <label for="txtProducer">Producer</label>
            <input type="text" class="form-control" name="productProducer" id="txtProducer">
        </div>
      <div class="form-group mt-2">
        <button class="btn btn-success" role="button" type="submit">Create</button>
        <button class="btn btn-warning" role="button">Cancel</button>
      </div>
    </form>
  </div>
</div>
</body>
</html>