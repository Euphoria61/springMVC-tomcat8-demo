<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2021/11/23
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.jsdelivr.net/npm/vue@2.5.21/dist/vue.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post({
                    url: "${pageContext.request.contextPath}/a2",
                    success: function (data) {
                        var vm = new Vue({
                            el:"#app",
                            /*Model：数据*/
                            data:{
                                items:data
                            }

                        });
                    }

                })

            })
        })
    </script>

</head>
<body>
<input type="button" value="加载数据" id="btn">
<table>
    <tr>
        <td>年龄</td>
        <td>姓名</td>
    </tr>
    <tbody id="content">

    </tbody>

</table>
<div id="app">
    <li v-for="item in items">
        {{item.age}}---{{item.name}}
    </li>

</div>
</body>
</html>
