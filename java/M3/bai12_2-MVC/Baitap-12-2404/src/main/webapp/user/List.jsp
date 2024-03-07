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
<a class="btn btn-success" role="button" href="/UserServlet?action=create">Create</a>
<%--<a class="btn btn-success" role="button" href="/product?action=remove">Remove</a>--%>
<table class="table" id="tableUser">

    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Country</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td>
                <a class="btn-success" href="/UserServlet?action=edit&id=${user.id}">Edit </a>
                <button
                        onclick="showModelDelete('${user.id}','${user.name}')"
                        type="button" class="btn btn-danger" data-toggle="modal" data-target="#modelDelete">Delete</button>
            </td>



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
                <p>Ban muon xoa: <span id="userName" style="color: red">no name</span> ?</p>
            </div>
            <form action="/UserServlet">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="id" value="" id="userId">
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
        $('#tableUser').dataTable({
            'pageLength' : 2,
            'searching' : false
        })
    })

    function showModelDelete(id, name) {
        console.log(id, name);
        document.getElementById("userName").innerText = name;
        document.getElementById("userId").value = id;
    }
            </script>
</body>
</html>