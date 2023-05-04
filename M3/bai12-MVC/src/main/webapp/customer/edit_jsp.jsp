<%--Date: 12-Apr-23--%>
<%--Time: 6:19 PM--%>
<%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <link href="/static/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="container">
  <form action="/CustomerServlet?action=edit" method="post">
    <h1>Edit a customer</h1>
<%--    <input type="text" name="ten" hidden value="${customerList.}">--%>
    <span>Ten : </span>
    <input readonly type="text" name="customerTen" value="${customer.ten}">
    <br>
    <br>
    <span>Tuoi: </span>
    <input type="text" name="customerTuoi" value="${customer.tuoi}">
    <br>
    <br>
    <span>Que Quan: </span>
    <input type="text" name="customerQueQuan" value="${customer.quequan}">
        <br>
        <br>
    <button class="btn btn-success" role="button" type="submit">Edit</button>
  </form>
</div>
</body>
</html>
