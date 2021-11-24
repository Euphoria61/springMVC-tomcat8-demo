<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2021/11/22
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
        function a() {
            $.post({
                url: "${pageContext.request.contextPath}/a1",
                data: {"name": $("#username").val()},
                success: function (data) {
                    alert(data);
                }
            })
        }
    </script>
</head>
<body>
<div>
    用户名：<input id="userName" type="text" onblur="a()">


</div>
<div>

</div>
</body>
</html>
