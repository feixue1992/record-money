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
    <title>资金列表</title>
</head>
<body>
<a href = "${pageContext.request.contextPath}/front/balance/to/add">增加记录</a>
<p><font
        <c:if test = "${userAccount.balance >= 0}">color = "green" </c:if>
        <c:if test = "${userAccount.balance < 0}">color = "red" </c:if>
    >剩余社费 ${userAccount.balance}</font></p>
<table cellpadding="1">
    <tr align = "center" style = "color : #2aabd2">
        <td style = "width:100px">ID</td>
        <td style = "width:100px">内容</td>
        <td style = "width:100px">资金</td>
        <td style = "width:100px">类型</td>
        <td style = "width:300px">创建时间</td>
        <td style = "width:300px">修改时间</td>
        <td style = "width:300px">操作</td>
    </tr>
    <c:forEach items="${balances}" var="balance">
        <tr align = "center" style = "color : #245269">
            <td>${balance.id}</td>
            <td>${balance.content}</td>
            <td>${balance.balance}</td>
            <td>
                <c:if test = "${balance.type == 0}">消费</c:if>
                <c:if test = "${balance.type == 1}">充值</c:if>
            </td>
            <td><fmt:formatDate value = "${balance.createTime}" pattern="yyyy-MM-dd HH:mm:ss" type = "both"></fmt:formatDate></td>
            <td><fmt:formatDate value = "${balance.updateTime}" pattern="yyyy-MM-dd HH:mm:ss" type = "both"></fmt:formatDate></td>
            <td><a href = "${pageContext.request.contextPath}/front/to/balance/update/${balance.id}">修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
                <a href = "${pageContext.request.contextPath}/front/balance/delete/${balance.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
