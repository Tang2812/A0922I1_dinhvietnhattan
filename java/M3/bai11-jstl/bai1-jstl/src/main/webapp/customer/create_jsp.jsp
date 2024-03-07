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
        <form class="col-md-6" action="/CustomerServlet?action=create" method="post">


            <h1 class="">Create new customer</h1>
            <div class="form-group">
                <label for="txtName">Ten</label>
                <input type="text" class="form-control" name="customerName" id="txtName">
            </div>
            <div class="form-group">
                <label for="txtTuoi"> Tuoi</label>
                <input type="number" class="form-control" name="customerTuoi" id="txtTuoi">
            </div>
            <div class="form-group">
                <label for="txtQueQuan">Que Quan</label>
                <input type="text" class="form-control" name="customerQueQuan" id="txtQueQuan">
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
