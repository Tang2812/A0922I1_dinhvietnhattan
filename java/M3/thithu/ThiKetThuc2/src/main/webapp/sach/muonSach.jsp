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
<form action ="/SachServlet?action=muon" method="post">
    <h1>Muon Sach</h1>
    <input type="hidden" name="id" value="${sach.maSach}">
    <p>Ma Muon Sach</p>
    <input type="text" class="form-control" name="maMuonSach" id="txtName">
    <p>Ten Sach</p>
    <input readonly type="text" class="form-control" name="sachTen" id="txtName" value="${sach.tenSach}">
    <p>Ten Hoc Sinh</p>
    <input type="text" class="form-control" name="productGia" id="tenHocSinh">
    <p>Ngay Muon Sach</p>
    <input readonly type="text" class="form-control" name="productSoLuong" id="ngayMuonSach" value="05/05/2023">
    <p>Ngay trar Sach</p>
    <input type="text" class="form-control" name="productMauSac" id="ngaytraSach">
    <%--    <input type="text" class="form-control" name="productDanhMuc" id="productDanhMuc" value="${product.danhMuc}">--%>
    <p></p>
    <input type="submit" href="/SachServlet">
    <button class="btn btn-success" role="button" type="submit">Muon</button>
</form>
</body>
</html>

