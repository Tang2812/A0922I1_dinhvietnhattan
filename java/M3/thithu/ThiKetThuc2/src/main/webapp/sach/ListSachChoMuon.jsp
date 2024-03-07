<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 14-Apr-23
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/static/css/bootstrap.css" rel="stylesheet" >
    <link rel="stylesheet" href="/static/datatables/css/dataTables.bootstrap4.css">
</head>
<body>
<table>
    <tr>
        <td>
            <form method="get">
                <input type="text" name="action" value="findTenSach" hidden>
                <input type="text" name="nameSearch">
                <button class="btn btn-success" type="submit">Find</button>
            </form>
        </td>
        <td>
            <form method="get">
                <input type="text" name="action" value="findTenHocSinh" hidden>
                <input type="text" name="nameSearch">
                <button class="btn btn-success" type="submit">Find</button>
            </form>
        </td>
    </tr>
</table>

<%--them + tim kiem--%>
<%--<table>--%>
<%--    <tr>--%>
<%--        <th STYLE="padding-right: 500px;">--%>

<%--            <a class="btn btn-success" role="button" href="/SachServlet?action=create">Create</a>--%>
<%--        </th>--%>

<%--        <th>--%>
<%--            <form method="get">--%>
<%--                <input type="text" name="action" value="find" hidden>--%>
<%--                <input type="text" name="nameSearch">--%>
<%--                <button class="btn btn-success" type="submit">Find</button>--%>
<%--            </form>--%>

<%--        </th>--%>
<%--    </tr>--%>
<%--</table>--%>
<%--ten table--%>
<table class="table" id="tableSach">

    <thead>
<%--    cac cot cua bang--%>
    <tr>
        <th scope="col">Ma Muon Sach</th>
        <th scope="col">Ten Sach</th>
        <th scope="col">Tac Gia</th>
        <th scope="col">Ten Hoc Sinh</th>
        <th scope="col">Lop</th>
        <th scope="col">Ngay Muon</th>
        <th scope="col">Ngay Tra</th>
        <th scope="col">Action</th>
    </tr>
<%--    --%>
    </thead>
    <tbody>
<%--    Duyet du lieu--%>
    <c:forEach items="${sachList}" var="sach">
        <tr>
            <td>${sach.maMuonSach}</td>
            <td>${sach.tenSach}</td>
            <td>${sach.tacGia}</td>
            <td>${sach.hoTen}</td>
            <td>${sach.lop}</td>
            <td>${sach.ngayMuon}</td>
            <td>${sach.ngayTra}</td>
<%--             edit+xoa--%>
            <td>
                <a class="btn-success" href="/SachServlet?action=tra&id=${sach.maMuonSach}">Tra Sach</a>
<%--                <button--%>
<%--                    &lt;%&ndash;                        ten+id&ndash;%&gt;--%>
<%--                        onclick="showModelDelete('${product.id}','${product.ten}')"--%>
<%--                        type="button" class="btn btn-danger" data-toggle="modal" data-target="#modelDelete">Delete</button>--%>
            </td>

<%----%>

        </tr>
    </c:forEach>
    </tbody>
</table>
<%--&lt;%&ndash;Modal&ndash;%&gt;--%>
<%--<div class="modal fade" id="modelDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">--%>
<%--    <div class="modal-dialog" role="document">--%>
<%--        <div class="modal-content">--%>
<%--            <div class="modal-header">--%>
<%--                <h5 class="modal-title">Modal title</h5>--%>
<%--                <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                    <span aria-hidden="true">&times;</span>--%>
<%--                </button>--%>
<%--            </div>--%>
<%--            <div class="modal-body">--%>
<%--&lt;%&ndash;                ten nguoi dung&ndash;%&gt;--%>
<%--                <p>Ban muon xoa: <span id="productTen" style="color: red">no name</span> ?</p>--%>
<%--            </div>--%>
<%--&lt;%&ndash;            gui di&ndash;%&gt;--%>
<%--            <form action="/ProductServlet">--%>
<%--                <input type="hidden" name="action" value="delete">--%>
<%--&lt;%&ndash;                id nguoi dung&ndash;%&gt;--%>
<%--                <input type="hidden" name="id" value="" id="productId">--%>
<%--                <div class="modal-footer">--%>
<%--                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                    <button type="submit" class="btn btn-danger">Delete</button>--%>
<%--                </div>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"--%>
<%--        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"--%>
<%--        crossorigin="anonymous"></script>--%>
<%--<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"--%>
<%--        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"--%>
<%--        crossorigin="anonymous"></script>--%>

<%--<script src="../static/datatables/js/jquery.dataTables.js"></script>--%>
<%--<script src="../static/datatables/js/dataTables.bootstrap4.js"></script>--%>
<%--<script>--%>
<%--    $(document).ready(function () {--%>
<%--        $('#tableProduct').dataTable({--%>
<%--            'pageLength' : 10,--%>
<%--            'searching' : false--%>
<%--        })--%>
<%--    })--%>

<%--    function showModelDelete(id, name) {--%>
<%--        console.log(id, name);--%>
<%--        document.getElementById("productTen").innerText = name;--%>
<%--        document.getElementById("productId").value = id;--%>
<%--    }--%>
<%--            </script>--%>
</body>
</html>