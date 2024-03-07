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
<form action="caculator" method="post">
    <input type="text" name="input1" value="${num1}">
    <input type="text" name="input2" value="${num2}">
    <br>
    <button type="submit" value="+" name="calculation">Additon(+)</button>
    <button type="submit" value="-" name="calculation">Subtraction(-)</button>
    <button type="submit" value="*" name="calculation">Multiplication(*)</button>
    <button type="submit" value="/" name="calculation">Division(/)</button>
</form>
<p>Kết Quả Là</p>
<p name="output">${result}</p>
</body>
</html>
