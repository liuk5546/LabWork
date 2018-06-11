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
  <style type="text/css">
    .btn{
      width: 100%;
    }
  </style>
  <title>管理实验室人员</title>
</head>
<body>
<div class="row container">
  <form class="col s6 push-s3 pull-s3 m4 push-m4 pull-m4">
    <div class="row">
      <div class="input-field col s12">
        <label for="nickName">账号</label>
        <input id="nickName" type="text" class="validate">

      </div>
    </div>
    <div class="row">
      <div class="input-field col s12">
        <label for="password">密码</label>
        <input id="password" type="password" class="validate">

      </div>
    </div>
    <div class="row">
      <div class="col s12">
        <input type="submit" class="waves-effect waves-light btn">
      </div>
    </div>
  </form>
</div>
<script type="text/javascript" src="/lib/materialize/js/jquery.min.js"></script>
<script type="text/javascript" src="/lib/materialize/js/materialize.min.js"></script>
</body>
</html>
