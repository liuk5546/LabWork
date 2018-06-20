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
    <title>第${num}实验室</title>
</head>

<body>
<!--Import jQuery before materialize.js-->
<ul class="collection">
    <c:forEach items="${computers}" var="computer">
        <li class="collection-item avatar">
            <span class="title">第${computer.idComputers}号机子</span>
            <p>ip:${computer.ip} <br>
                subnetMask:${computer.subnetMask}<br>
            </p>
            <a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>
        </li>
    </c:forEach>
</ul>

<div class="container center">
    <a class="waves-effect waves-light btn" href="#addComputer">添加计算机</a>
</div>


<!-- Modal Structure -->
<div id="addComputer" class="modal">
    <div class="container">
        <form action="/computers/add/${num}" method="post">
            <div class="modal-content">
                <h4>添加计算机</h4>
                <div class="input-field col s6">
                    <input placeholder="ID" name="idComputers" id="ID" type="text" class="validate">
                    <label for="ID">计算机编号</label>
                </div>
                <div class="input-field col s6">
                    <input placeholder="ip" name="ip" id="ip" type="text" class="validate">
                    <label for="ip">计算机IP</label>
                </div>
                <div class="input-field col s6">
                    <input placeholder="mask" name="subnetMask" id="position" type="text" class="validate">
                    <label for="position">子网掩码</label>
                </div>
            </div>
            <div class="modal-footer">
                <input type="submit" class=" modal-action modal-close waves-effect waves-green btn-flat" value="添加"/>
            </div>
        </form>
    </div>

</div>
<script type="text/javascript" src="/lib/materialize/js/jquery.min.js"></script>
<%--<script type="text/javascript" src="/lib/materialize/js/materialize.min.js"></script>--%>
<script src="/lib/materialize/js/materialize.min.js"></script>
<script>
    $(document).ready(function(){
        // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
        $('.modal').modal();
    });
</script>
</body>
</html>