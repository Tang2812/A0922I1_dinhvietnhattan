<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 24-May-23
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>LIST EMPLOYEE</h1>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>contactNumber</th>
    </tr>
    <c:forEach items="${employees}" var="e">
        <tr>
        <td>${e.id}</td>
        <td>${e.name}</td>
        <td>${e.contactNumber}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
