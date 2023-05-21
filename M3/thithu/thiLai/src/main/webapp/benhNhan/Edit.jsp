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
<form action ="/BenhNhanServlet?action=edit" method="post">
    <h1>Thong tin Benh An</h1>
    <p>Ma Benh An</p>
    <input type="text" readonly name="maBenhAn" value="${benhNhan.maBenhAn}">
    <p>Ma Benh Nhan</p>
    <input type="text" readonly class="form-control" name="maBenhNhan" id="maBenhNhan" value="${benhNhan.maBenhNhan}">
    <p>Ten Benh Nhan</p>
    <input type="text" class="form-control" name="tenBenhNhan" id="tenBenhNhan" value="${benhNhan.tenBenhNhan}">
    <p>Ngay Nhap Vien</p>
    <input type="text" class="form-control" name="ngayNhapVien" id="ngayNhapVien" value="${benhNhan.ngayNhapVien}">
    <p>Ngay Ra Vien</p>
    <input type="text" class="form-control" name="ngayRaVien" id="ngayRaVien" value="${benhNhan.ngayRaVien}">
    <p>Ly do nhap vien</p>
    <input type="text" class="form-control" name="lyDoNhapVien" id="lyDoNhapVien" value="${benhNhan.lyDoNhapVien}">
<%--    <input type="text" class="form-control" name="productDanhMuc" id="productDanhMuc" value="${product.danhMuc}">--%>
    <p></p>
    <input type="submit">
    <button class="btn btn-success" role="button" type="submit">Edit</button>
</form>
</body>
</html>

