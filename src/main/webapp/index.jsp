<%--
  Created by IntelliJ IDEA.
  User: P1312119
  Date: 12/6/2021
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生名单</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            var html ="";
            $.ajax({
                url:"${pageContext.request.contextPath}/student/list",
                dataType:"json",
                success:function (data) {
                    $.each(data,function (index,n) {
                        html+='<tr><th><input type="checkbox" id='+n.id+'></th>';
                        html+='<th><input type="text" value='+n.id+'></th>';
                        html+='<th><input type="text" value='+n.name+'></th>';
                        html+='<th><input type="text" value='+n.age+'></th>';
                        html+='<th><input type="text" value='+n.address+'></th>';
                        html+='<th><input type="text" value='+n.classroom_id+'></th>';
                        html+='<th><input type="text" value='+n.brithday+'></th>';
                        html+='<th><a href="javascript:void(0)" onclick="deleteStu('+n.id+')">删除</th>';
                        html+='<th><a href="javascript:void(0)" onclick="editStu('+n.id+')">编辑</th></tr>';
                    });
                    $("#tbody").append(html);
                }
            })
        });
        function deleteStu(id) {
            location.href = "${pageContext.request.contextPath}/student/delete?id="+id;
        }

        function editStu(id) {
            location.href = "${pageContext.request.contextPath}/student/edit?id="+id;
        }
    </script>
</head>
<body>

<form action="${pageContext.request.contextPath}/student/search" method="post">
    <input type="text" placeholder="学生姓名" name="name">&nbsp;&nbsp;
    <input type="text" placeholder="学生年龄" name="age">&nbsp;&nbsp;
    <input type="text" placeholder="学生生日" name="brithday">&nbsp;&nbsp;
    <input type="submit" value="搜索">
</form>

<table border="3px" align="center">
    <tr>
        <th><input type="checkbox" id="checkAll"></th>
        <th>学生序列号</th>
        <th>学生姓名</th>
        <th>学生年龄</th>
        <th>学生地址</th>
        <th>学生教室</th>
        <th>学生生日</th>
        <th colspan="2">操作</th>
    </tr>
    <tbody id="tbody">

    </tbody>
</table>

</body>
</html>
