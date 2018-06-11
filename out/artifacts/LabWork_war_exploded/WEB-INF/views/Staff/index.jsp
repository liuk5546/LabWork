<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liukun
  Date: 2018/6/6
  Time: 上午10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <link type="text/css" rel="stylesheet" href="/lib/materialize/css/materialize.min.css"  media="screen,projection"/>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>管理实验室人员</title>
</head>
<body>
<h2>用户管理</h2>
<table width="100%" class="centered bordered">
    <tr class="centered">
        <th>编号</th>
        <th>职位</th>
        <th>名称</th>
        <th>登陆名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="staff">
        <tr>
            <td>${staff.idStaff}</td>
            <td>${staff.positionStaff}</td>
            <td>${staff.nameStaff}</td>
            <td>${staff.nikeName}</td>
            <td>${staff.password}</td>
            <td><a href="delete/${staff.idStaff}" class="del">删除</a></td>
        </tr>
    </c:forEach>
    <tr>
        <form action="/staff/addOne">
            <td><input type="text" name="idStaff"></td>
            <td><input type="text" name="positionStaff"></td>
            <td><input type="text" name="nameStaff"></td>
            <td><input type="text" name="nikeName"></td>
            <td><input type="text" name="password"></td>
            <td><input type="submit" value="提交"></td>
        </form>
    </tr>
</table>
<script>
    let  items = document.querySelectorAll(".del");
    items.forEach(function (e) {
        e.onclick = function () {
            return confirm("您确定要删除吗？")
        }
    })
</script>
<script type="text/javascript" src="/lib/materialize/js/jquery.min.js"></script>
<script type="text/javascript" src="/lib/materialize/js/materialize.min.js"></script>
</body>
</html>
