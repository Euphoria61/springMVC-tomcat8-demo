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
    <script src="https://unpkg.com/vue@3.2.12/dist/vue.global.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.post({
                    url: "${pageContext.request.contextPath}/a2",
                    success: function (data) {
                      Vue.createApp({
                          data(){
                              return{
                                  items:data
                              }

                          }
                      }).mount('#ul')
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
<ul id="ul">
    <li v-for="item in items"></li>
    {{ item.name }} {{item.age}}
</ul>
    </tbody>

</table>

</body>
</html>
