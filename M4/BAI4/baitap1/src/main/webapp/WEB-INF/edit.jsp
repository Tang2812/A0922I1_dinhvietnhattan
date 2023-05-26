<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/24/2023
  Time: 7:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new product</title>
</head>
<body>
    <h1>EDIT YOUR MAIL</h1>
    <form:form action="/Mail/edit" method="post" modelAttribute="mail">
        <table>
            <tr>
                <td>lANGUAGES</td>
                <td><form:select path="languages">
                    <form:option value="Englist">Englist</form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select></td>

            </tr>
            <tr>
                <td>PAGESIZE</td>
                <td><form:label path="pageSize">Show
                    <form:select path="pageSize">
                     <form:option value="5">5</form:option>
                     <form:option value="10">10</form:option>
                      <form:option value="15">15</form:option>
                      <form:option value="20">20</form:option>
                </form:select> emails per page</form:label></td>

            </tr>
            <tr>
                <td>SIGNATURE</td>
                <td><form:input size="50px" path="signature"

                /></td>
            </tr>
            <tr>
                <td><input type="reset" value="Reset"></td>
                <td><input type="submit" value="Register"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
