<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="/lib/materialize/css/materialize.min.css" media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>document</title>
</head>
<c:forEach items="${list}" var="labsEntity">
    <div class="row">
        <div class="col s12 m6">
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
</c:forEach>
<body>
<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="/lib/materialize/js/jquery.min.js"></script>
<script type="text/javascript" src="/lib/materialize/js/materialize.min.js"></script>
</body>
</html>