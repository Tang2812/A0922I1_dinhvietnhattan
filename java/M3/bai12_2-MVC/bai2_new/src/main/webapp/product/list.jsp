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

</head>
<body>
<a class="btn btn-success" role="button" href="/product?action=create">Create</a>
<a class="btn btn-success" role="button" href="/product?action=remove">Remove</a>
<table class="table">

    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Status</th>
        <th scope="col">Producer</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.status}</td>
<%--            <c:forEach var="producerName" items="${producerList}">--%>
<%--                <c:if test="${product.producer == producerName.id}">--%>
<%--                    <td>${ producerName.name}</td>--%>
<%--                </c:if>--%>
<%--            </c:forEach>--%>

            <td>${product.producer}</td></tr>
        <td ><a class="btn-success" href="/product?action=view&id=${product.id}">View </a></td>
        <td ><a class="btn-success" href="/product?action=edit&id=${product.id}">Edit </a></td>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
