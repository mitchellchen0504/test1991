<%--
  Created by IntelliJ IDEA.
  User: P1312119
  Date: 13/6/2021
  Time: 12:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生信息列表</title>
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
    <c:forEach items="${studentList}" var="student">
        <tr>
            <th><input type="checkbox" id="checkSingle"></th>
            <th><input type="text" value="${student.id}"></th>
            <th><input type="text" value="${student.name}">学生姓名</th>
            <th><input type="text" value="${student.age}">学生年龄</th>
            <th><input type="text" value="${student.address}">学生地址</th>
            <th><input type="text" value="${student.classroom_id}">学生教室</th>
            <th><input type="text" value="${student.brithday}">学生生日</th>
        </tr>
    </c:forEach>
</table>

</body>
</html>
