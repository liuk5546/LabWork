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
                    <a href="/computers/info/${labsEntity.idLab}">进入实验室</a>
                </div>
            </div>
        </div>
    </div>
</c:forEach>
<a class="waves-effect waves-light btn" href="#addLab">添加实验室</a>

<!-- Modal Structure -->
<div id="addLab" class="modal">
    <div class="container">
        <form action="/labs/addOne" method="post">
            <div class="modal-content">
                <h4>添加实验室</h4>
                <p>请认真填写实验室信息，实验室一旦创建您将没有权限删除</p>
                <div class="input-field col s6">
                    <input placeholder="ID" name="idLab" id="ID" type="text" class="validate">
                    <label for="ID">实验室编号</label>
                </div>
                <div class="input-field col s6">
                    <input placeholder="16个中英文字符" name="nameLab" id="name" type="text" class="validate">
                    <label for="name">实验室名词</label>
                </div>
                <div class="input-field col s6">
                    <input placeholder="ID" name="postionLab" id="position" type="text" class="validate">
                    <label for="position">实验室地址</label>
                </div>
                <div class="input-field col s6">
                    <input placeholder="ID" name="descriptionLab" id="descriptionLab" type="text" class="validate">
                    <label for="descriptionLab">实验室描述</label>
                </div>
                <div class="input-field col s6">
                    <input placeholder="ID" name="getWayLab" id="getWayLab" type="text" class="validate">
                    <label for="getWayLab">实验室网关</label>
                </div>
            </div>
            <div class="modal-footer">
                <input type="submit" class=" modal-action modal-close waves-effect waves-green btn-flat" value="提交"/>
            </div>
        </form>
    </div>

</div>
<body>
<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="/lib/materialize/js/jquery.min.js"></script>
<script type="text/javascript" src="/lib/materialize/js/materialize.min.js"></script>
<script>
    $(document).ready(function(){
        // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
        $('.modal').modal();
    });
</script>
</body>
</html>