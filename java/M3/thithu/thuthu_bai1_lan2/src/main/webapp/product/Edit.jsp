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
<form action ="/ProductServlet?action=edit" method="post">
    <h1>Thong tin Nguoi dung</h1>
    <input type="hidden" name="id" value="${product.id}">
    <p>Ten</p>
    <input type="text" class="form-control" name="productTen" id="txtName" value="${product.ten}">
    <p>Gia</p>
    <input type="text" class="form-control" name="productGia" id="productGia" value="${product.gia}">
    <p>So Luong</p>
    <input type="text" class="form-control" name="productSoLuong" id="productSoLuong" value="${product.soLuong}">
    <p>Mau sac</p>
    <input type="text" class="form-control" name="productMauSac" id="productMauSac" value="${product.mauSac}">
    <p>Mo ta</p>
    <input type="text" class="form-control" name="productMoTa" id="productMoTa" value="${product.moTa}">
    <p>Danh muc</p>
    <select name="productDanhMuc" id="productDanhMuc">
        <option value="${product.danhMuc}">${product.danhMuc}</option>
        <option value="Iphone">Iphone</option>
        <option value="Redmi">Redmi</option>
    </select>
<%--    <input type="text" class="form-control" name="productDanhMuc" id="productDanhMuc" value="${product.danhMuc}">--%>
    <p></p>
    <input type="submit" href="/ProductServlet">
    <button class="btn btn-success" role="button" type="submit">Edit</button>
</form>
</body>
</html>

