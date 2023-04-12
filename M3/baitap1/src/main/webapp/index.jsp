<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="/display-discount" method="post">
    <input type="text" name="description" placeholder="Enter product: "/>
    <br>
    <br>
    <input type="text" name="price" placeholder="Enter price: "/>
    <br>
    <br>
    <input type="text" name="percen" placeholder="Enter Discount Percent: "/>
    <br>
    <br>
    <input type = "submit" id = "submit" value = "Calculate"/>
</form>
</body>
</html>