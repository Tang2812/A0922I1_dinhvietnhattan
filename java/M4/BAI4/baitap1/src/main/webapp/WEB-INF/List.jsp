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
<h1>MAIL INFOR</h1>
<table border="1">
    <tr>
        <th>LANGUAGES</th>
        <th>PAGESIZE</th>
        <th>SIGNATURE</th>
    </tr>

        <tr>
        <td>${mail.languages}</td>
        <td>${mail.pageSize}</td>
        <td>${mail.signature}</td>
        </tr>

</table>
<h3><a href="/Mail/edit">Edit mail</a></h3>
</body>
</html>
