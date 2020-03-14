<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>入门程序</title>
</head>
<body>
你好
<table>
    <tr>
        <td>用户ID：</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td>用户姓名：</td>
        <td>${user.username}</td>
    </tr>
</table>
</body>
</html>