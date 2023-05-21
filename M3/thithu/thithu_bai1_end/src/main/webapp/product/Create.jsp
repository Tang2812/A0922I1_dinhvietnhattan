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
<%--    url--%>
    <form class="col-md-6" action="/ProductServlet?action=create" method="post">
<%----%>

      <h1 class="">Create new product</h1>
    <div class="form-group">
        <label for="txtName">Name</label>
        <input type="text" class="form-control" name="productTen" id="txtName">
    </div>
    <%--      Email--%>
    <div class="form-group">
        <label for="productGia">Gia</label>
        <input type="text" class="form-control" name="productGia" id="productGia">
    </div>
    <%--      Email--%>
    <div class="form-group">
        <label for="productSoLuong">So Luong</label>
        <input type="text" class="form-control" name="productSoLuong" id="productSoLuong">
    </div>
    <%--      Country--%>
    <div class="form-group">
        <label for="productMauSac">Mau Sac</label>
        <input type="text" class="form-control" name="productMauSac" id="productMauSac">
    </div>
    <div class="form-group">
        <label for="productMoTa">Mo Ta</label>
        <input type="text" class="form-control" name="productMoTa" id="productMoTa">
    </div>
    <div class="form-group">
        <label for="productDanhMuc">Danh Muc</label>
        <%--                <input type="text" class="form-control" name="productDanhMuc" id="productDanhMuc">--%>
        <select name="productDanhMuc" id="productDanhMuc">
            <option>Danh Muc</option>
            <option value="Iphone">Iphone</option>
            <option value="Redmi">Redmi</option>
        </select>
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