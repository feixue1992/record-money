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
    <title>增加用户</title>
</head>
<body>
<table cellpadding="1">
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
        <td><a href = "javascript:void(0)" id = "submit">提交</a></td>
        <td><a href = "javascript:void(0)" id = "clear">重置</a></td>
    </tr>
</table>
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
