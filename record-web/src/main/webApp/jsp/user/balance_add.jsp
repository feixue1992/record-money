<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file ="../common/default.jsp"%>
<%--
  Created by IntelliJ IDEA.
  balance: Administrator
  Date: 2016/11/2
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>增加记录</title>
</head>
<body>
<table cellpadding="1">
    <form id = "fm" method = "post">
        <input type = "hidden" name = "balance.id" value = "${balance.id}"/>
             <tr>
                <td>内容</td>
                 <td><select name = "balance.type">
                        <option value = "0">消费</option>
                        <option value = "1">充值</option>
                    </select>
                </td>
             </tr>
             <tr>
                <td>内容</td><td><input type = "text" name = "balance.content" id = "content"></td>
            </tr>
            <tr>
                <td>资金</td><td><input type = "text" name = "balance.balance" id = "balance"></td>
            </tr>
    </form>
    <tr>
        <td><a href = "javascript:void(0)" id = "submit">提交</a></td>
        <td><a href = "javascript:void(0)" id = "clear">重置</a></td>
    </tr>
</table>
<script>
    var balance = {
        init : function() {
          $('#submit').bind('click', function() {
              balance.method.add();
          });
          $('#clear').bind('click', function() {
              balance.method.clear();
          });
        },
        url : {
            add : contextPath + "/front/balance/add",
            update : contextPath + "/front/balance/update"
        },
        method : {
            add : function() {
                $("#fm").attr("action", balance.url.add);
                var money = $('#balance').val();
                var reg = /^([1-9]\d{0,9}|0)([.]?|(\.\d{1,2})?)$/;
                if (reg.test(money) == false) {
                    alert("请输入正确的金额");
                    return;
                }
                $("#fm").submit();
            },
            clear : function() {
                $("#content").val('');
                $('#balance').val('');
            }
        }
    }

    $(function() {
        balance.init();
    });
</script>
</body>
</html>
