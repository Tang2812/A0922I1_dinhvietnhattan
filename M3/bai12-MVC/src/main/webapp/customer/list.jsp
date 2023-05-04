<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="/static/css/bootstrap.css" rel="stylesheet" >
    <title>Title</title>
</head>
<body>

<h1>Customer</h1>
<a class="btn btn-success" role="button" href="/CustomerServlet?action=create">Create</a>
<a class="btn btn-success" role="button" href="/CustomerServlet?action=remove">Remove</a>
<%--<a class="btn btn-success" role="button" href="/CustomerServlet?action=edit">Edit</a>--%>
<table class="table">
  <thead>
  <tr>
    <th scope="col">Ten</th>
    <th scope="col">Tuoi</th>
    <th scope="col">Dia chi</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${customerList}" var="customer">
    <tr>
      <td>${customer.ten}</td>
      <td>${customer.tuoi}</td>
      <td>${customer.quequan}</td>
      <td ><a class="btn-success" href="/CustomerServlet?action=edit&id=${customer.ten}">Edit </a></td>
      <td ><a class="btn-success" href="/CustomerServlet?action=View&id=${customer.ten}">View </a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
