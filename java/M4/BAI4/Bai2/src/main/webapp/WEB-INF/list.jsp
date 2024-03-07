<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 28/05/2023
  Time: 12:18 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Khai Bao Y Te</title>
</head>
<body>
<%--<div style="text-align: center">--%>
<%--<h1>TỜ KHAI Y TẾ</h1>--%>
<%--<h2>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DICH BÊNH TRUYỀN NHIỄM</h2>--%>
<%--<h4 style="color: red">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể bị xử lý hình sự</h4>--%>
<%--</div>--%>
<a href="/create">create</a>
<table style="border-collapse:collapse" border="1">
    <tr>
        <th>Họ Tên</th>
        <th>Năm sinh</th>
        <th>Giới tính</th>
        <th>Quốc tịch</th>
        <th>Số CMND</th>
        <th>Thông tin đi lại</th>
        <th>Số hiệu phương tiện</th>
        <th>Ngày khởi hành</th>
        <th>Ngày kết thúc</th>
        <th>Tỉnh/thành</th>
        <th>Quận/huyện</th>
        <th>Phường/xã</th>
        <th>Điện thoại</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${toKhai}" var="d">
        <tr>
            <td>${d.ten}</td>
            <td>${d.ngaySinh}</td>
            <td>${d.gioiTinh}</td>
            <td>${d.quocTich}</td>
            <td>${d.cmnd}</td>
            <td>${d.phuongTien}</td>
            <td>${d.bienSo}</td>
            <td>${d.ngayKhoiHanh}</td>
            <td>${d.ngayKetThuc}</td>
            <td>${d.tinh}</td>
            <td>${d.huyen}</td>
            <td>${d.xa}</td>
            <td>${d.sdt}</td>
            <td>${d.email}</td>
            <td><a href="/update?iCard=${d.cmnd}">Update</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>