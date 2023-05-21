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

<%--them + tim kiem--%>
<%--<table>--%>
<%--    <tr>--%>
<%--        <th STYLE="padding-right: 500px;">--%>

<%--            <a class="btn btn-success" role="button" href="/ProductServlet?action=create">Create</a>--%>
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
<table class="table" id="tableBenhNhan">

    <thead>
<%--    cac cot cua bang--%>
    <tr>
        <th scope="col">Ma Benh An</th>
        <th scope="col">Ma Benh Nhan</th>
        <th scope="col">Ten Benh Nhan</th>
        <th scope="col">Ngay nhap vien</th>
        <th scope="col">Ngay ra vien</th>
        <th scope="col">Ly do nhap vien</th>
        <th scope="col">Tac vu</th>
    </tr>
<%--    --%>
    </thead>
    <tbody>
<%--    Duyet du lieu--%>
    <c:forEach items="${benhNhanList}" var="benhNhan">
        <tr>
            <td>${benhNhan.maBenhAn}</td>
            <td>${benhNhan.maBenhNhan}</td>
            <td>${benhNhan.tenBenhNhan}</td>
            <td>${benhNhan.ngayNhapVien}</td>
            <td>${benhNhan.ngayRaVien}</td>
            <td>${benhNhan.lyDoNhapVien}</td>
<%--             edit+xoa--%>
            <td>
                <a class="btn-success" href="/BenhNhanServlet?action=edit&maBenhAn=${benhNhan.maBenhAn}">Edit </a>
                <button
                    <%--                        ten+id--%>
                        onclick="showModelDelete('${benhNhan.maBenhAn}')"
                        type="button" class="btn btn-danger" data-toggle="modal" data-target="#modelDelete">Delete</button>
            </td>

<%----%>

        </tr>
    </c:forEach>
    </tbody>
</table>
<%--Modal--%>
<div class="modal fade" id="modelDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
<%--                ten nguoi dung--%>
                <p>Ban muon xoa: <span id="maBenhAn1" style="color: red">no name</span> ?</p>
            </div>
<%--            gui di--%>
            <form action="/BenhNhanServlet">
                <input type="hidden" name="action" value="delete">
<%--                id nguoi dung--%>
                <input type="hidden" name="maBenhAn" value="" id="maBenhAn">
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-danger">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>

<script src="../static/datatables/js/jquery.dataTables.js"></script>
<script src="../static/datatables/js/dataTables.bootstrap4.js"></script>
<script>
    $(document).ready(function () {
        $('#tableBenhNhan').dataTable({
            'pageLength' : 10,
            'searching' : false
        })
    })

    function showModelDelete(maBenhAn) {

        document.getElementById("maBenhAn").innerText = maBenhAn;
        document.getElementById("maBenhAn").value = maBenhAn
        document.getElementById("maBenhAn1").value = maBenhAn;
        document.getElementById("maBenhAn1").innerText = maBenhAn
    }
            </script>
</body>
</html>