<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 12-May-23
  Time: 8:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/Sandwich">
    <input type="checkbox" name="condiment" value="lectuce">
    <label>lectuce</label>
    <input type="checkbox" name="condiment" value="Tomato">
    <label>Tomato</label>
    <input type="checkbox" name="condiment" value="Mustard">
    <label>Mustard</label>
    <input type="checkbox" name="condiment" value="Sprouts">
    <label>Sprouts</label>
    <hr>
    <input type="submit" value="save">
</form>
<h1>${giavi}</h1>
</body>
</html>
