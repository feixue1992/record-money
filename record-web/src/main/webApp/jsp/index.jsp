<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/2
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello java</title>
  </head>
  <body>
    <table>
      <c:forEach items="users" var="user">
        <tr>
          <td>姓名</td><td>${user.username}</td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
