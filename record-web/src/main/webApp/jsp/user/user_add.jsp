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
    <title>修改用户</title>
</head>
<body>
`<table cellpadding="1">
    <form id = "fm" method = "post">
        <input type = "hidden" name = "user.id" value = "${user.id}"/>
             <tr>
                <td>姓名</td><td><input type = "text" name = "user.username"></td>
            </tr>
            <tr>
                <td>昵称</td><td><input type = "text" name = "user.nickname"></td>
            </tr>
            <tr>
                <td>密码</td><td><input type = "password" name = "user.password"></td>
            </tr>
    </form>
    <tr>
        <td><button id = "submit">提交</button></td>
        <td><button id = "clear">重置</button></td>
    </tr>
`</table>
<script>
    var user = {
        init : function() {
          $('#submit').bind('click', function() {
              user.method.add();
          });
          $('#clear').bind('click', function() {
              user.method.clear();
          });
        },
        url : {
            add : contextPath + "/front/user/add",
            update : contextPath + "/front/user/update"
        },
        method : {
            add : function() {
                $("#fm").attr("action", user.url.add);
                $("#fm").submit();
            },
            clear : function() {
                $("#nickname").val('');
                $('#password').val('');
            }
        }
    }

    $(function() {
        user.init();
    })
</script>
</body>
</html>
