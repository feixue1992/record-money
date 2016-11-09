<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file ="../common/default.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/2
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">
    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <title>用户列表</title>
</head>
<body>
<p></p>
<a href = "/front/user/to/add">增加用户</a>
<table cellpadding="1" bgcolor="#7fffd4" border="2">
    <tr align = "center" style = "color : #2aabd2">
        <td style = "width:100px">ID</td>
        <td style = "width:100px">姓名</td>
        <td style = "width:100px">昵称</td>
        <td style = "width:300px">创建时间</td>
        <td style = "width:300px">修改时间</td>
        <td style = "width:300px">操作</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr align = "center" style = "color : #245269">
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.nickname}</td>
            <td><fmt:formatDate value = "${user.createTime}" pattern="yyyy-MM-dd HH:mm:ss" type = "both"></fmt:formatDate></td>
            <td><fmt:formatDate value = "${user.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" type = "both"></fmt:formatDate></td>
            <td><a href = "/front/to/user/update/${user.id}">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href = "/front/user/delete/${user.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
