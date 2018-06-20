<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="/lib/materialize/css/materialize.min.css"
          media="screen,projection"/>
    <%--<link type="text/css" rel="stylesheet" href="/css/main.css" media="screen,projection">--%>
    <!--Let browser know website is optimized for mobile-->
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>您好，${staff.nameStaff}！</title>
</head>

<body>
<!--Import jQuery before materialize.js-->
<nav class="blue">
    <div class="nav-wrapper">
        <%--model是用来定义不同的模块的--%>
        <a style="font-size: 18px" href="#" class="brand-logo center">${model}</a>
        <ul id="nav-mobile" class="left">
            <li><a href="#" id="menu" data-activates="slide-out" class="blue" ><i class="material-icons">menu</i></a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <div>
        <div class="col s12 m4">
            <div class="card blue-grey darken-1">
                <div class="card-content white-text">
                    <span class="card-title">${labsEntity.nameLab}</span>
                    <p>${labsEntity.descriptionLab}</p>
                </div>
                <div class="card-action">
                    <a href="#">进入实验室</a>
                </div>
            </div>
        </div>
    </div>
    <div >
        <div class="col s12 m4">
            <div class="card blue-grey darken-1">
                <div class="card-content white-text">
                    <span class="card-title">${labsEntity.nameLab}</span>
                    <p>${labsEntity.descriptionLab}</p>
                </div>
                <div class="card-action">
                    <a href="#">进入实验室</a>
                </div>
            </div>
        </div>
    </div>
</div>

<ul id="slide-out" class="side-nav" style="transform: translateX(-100%)">
    <li>
        <div class="userView center">
            <div class="background">
                <img src="/img/office.jpg">
            </div>
            <a href="#!name"><span class="white-text name">${staff.nameStaff}</span></a>
            <a href="#!email"><span class="white-text email">${staff.idStaff}@zucc.edu.cn</span></a>
        </div>
    </li>
    <c:forEach items="${module}" var="fun">
        <li><a href="#!">${fun}</a></li>
    </c:forEach>

</ul>
<script type="text/javascript" src="/lib/materialize/js/jquery.min.js"></script>
<%--<script type="text/javascript" src="/lib/materialize/js/materialize.min.js"></script>--%>
<script src="/lib/materialize/js/materialize.min.js"></script>
<script type="text/javascript" src="/js/init.js"></script>
<script>
    function loadTheLabs() {
        $.ajax({
            url : "/labs/json/getAll",
            contentType : "application/json;charset=UTF-8",
            dataType : "json",
            success : function (data) {

                if(data != null){
                    let labs = data.labsEntityList;
                    //处理数组
                    labs.forEach(function (t) {

                    })
                }
            }
        })
    }
</script>
</body>
</html>