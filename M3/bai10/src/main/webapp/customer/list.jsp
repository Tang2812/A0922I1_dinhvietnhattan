<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link href="/static/css/bootstrap.css" rel="stylesheet" >
    <title>Title</title>
</head>
<body>
<h1>Customer</h1>
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
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
