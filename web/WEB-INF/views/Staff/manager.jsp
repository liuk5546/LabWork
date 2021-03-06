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
    <div class="input-field col s12">
        <select id="selected">
            <option value="" disabled selected>Choose your option</option>

        </select>
        <label>Materialize 下拉列表</label>
    </div>

    <table id="table" width="100%" class="centered bordered">
        <tr  class="centered">
            <th>编号</th>
            <th>开始时间</th>
            <th>结束时间</th>
            <th>使用机号</th>
        </tr>
    </table>
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

    <li><a href="/labs/getAll">实验室基本信息管理</a></li>
    <li><a href="#">实验室历史信息查询</a></li>
    <li onclick="loadTheLog()"><a href="#">信息统计</a></li>
    <li><a href="/staff/index">人员管理</a></li>


</ul>
<script type="text/javascript" src="/lib/materialize/js/jquery.min.js"></script>
<%--<script type="text/javascript" src="/lib/materialize/js/materialize.min.js"></script>--%>
<script src="/lib/materialize/js/materialize.min.js"></script>
<script type="text/javascript" src="/js/init.js"></script>
<script>
    var staffs = [];
    $(document).ready(function() {
        if(staffs.length===0)
            $.ajax({
                url: "/staff/json/getAll",
                contentType : "application/json;charset=UTF-8",
                dataType : "json",
                success:function(data){
                    data.staffList.forEach(function (t,i) {
                        staffs.push(t);
                        let node = document.createElement('option');
                        node.text = t.nameStaff;
                        let attr = document.createAttribute('value');
                        attr.value = i+1;
                        node.setAttributeNode(attr);
                        console.log(node);
                        $("#selected").append(node);

                    })
                    console.log('staffs',staffs);
                    $('select').material_select();
                }
            })

    });
//    function loadTheLabs() {
//        $.ajax({
//            url : "/labs/json/getAll",
//            contentType : "application/json;charset=UTF-8",
//            dataType : "json",
//            success : function (data) {
//
//                if(data != null){
//                    let labs = data.labsEntityList;
//                    //处理数组
//                    labs.forEach(function (t) {
//
//                    })
//                }
//            }
//        })
//    }
    let fomate = function (date) {
        return ''+(1900+date.getYear())+'年 '+(date.getMonth()+1)+'月 '+date.getDate()+'日 '+date.getHours()+':'
        +date.getMinutes();
    }
    //获取数据统计
    function loadTheLog(staffid) {
        $.ajax({
            url: "/log/stafflog",
            contentType : "application/json;charset=UTF-8",
            dataType : "json",
            data:{
                id : staffid,
            },
            success : function (data) {
                if(data!=null){
                    console.log(data);
                    $('#tbcontent').remove();
                    let html = '';
                    data.logsEntityList.forEach(function (element) {
                        html+='<tr id="tbcontent" >' +
                        '<td>'+element.fkIdStaff+'</td>' +
                        '<td>'+fomate(new Date(element.startTime))+'</td>' +
                        '<td>'+(element.endTime?fomate(new Date(element.endTime)):'-')+'</td>' +
                        '<td>'+element.fkIdComputers+'</td>' +
                        '</tr>'
                    })
                    $('#table').append(html);
                }
            }
        })
    }
    //选中的那个id
    $("#selected").change(
        function () {
            let index = Number.parseInt($("#selected option:selected").val()) - 1;
            let staffid = staffs[index].idStaff;
            loadTheLog(staffid);
    }
    )
</script>
</body>
</html>