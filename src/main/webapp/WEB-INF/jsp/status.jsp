<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%@include file="common-header.jsp"%>

    <script>
        function getNowFormatDate() {
            var date = new Date();
            var seperator1 = "-";
            var seperator2 = ":";
            var month = date.getMonth() + 1;
            var strDate = date.getDate();
            if (month >= 1 && month <= 9) {
                month = "0" + month;
            }
            if (strDate >= 0 && strDate <= 9) {
                strDate = "0" + strDate;
            }
            var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
                    + " " + date.getHours() + seperator2 + date.getMinutes()
                    + seperator2 + date.getSeconds();
            document.getElementById("timer").innerHTML = currentdate;
            return currentdate;
        }
        setInterval("getNowFormatDate()", 1000);
    </script>

</head>
<body>
    <%@include file="common-title.jsp"%>
    <div class="container-fluid-full">
        <div class="row-fluid">

        <%@include file="common-mainmenu.jsp"%>
        <noscript>
            <div class="alert alert-block span10">
                <h4 class="alert-heading">Warning!</h4>
                <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
            </div>
        </noscript>

        <!-- start: Content -->
        <div id="content" class="span10">

            <ul class="breadcrumb">
                <li>
                    <i class="icon-home"></i>
                    <a href="index">Home</a>
                    <i class="icon-angle-right"></i>
                </li>
                <li><a href="#">Status</a></li>
            </ul>
            <div>
                <h1>Status Panel</h1>
                <div class="header span12">
                    <div class="from"><i class="halflings-icon user"></i> <b>Admistrator</b> / administrator@htsc.com</div>
                    <div class="date"><i class="halflings-icon time"></i> <b id = "timer"></b> </div>
                    <div class="menu"></div>
                </div>

                <div class="span10">
                    <table class="table">
                        <caption class="header">监控状态</caption>

                        <thead>
                        <tr class="success">
                            <th>序号</th>
                            <th>名称</th>
                            <th>监控IP</th>
                            <th>监控类型</th>
                            <th>实时值</th>
                            <th>监控状态</th>
                        </tr>
                        </thead>
                        <tbody id="tbodycontent">
                        </tbody>
                    </table>
                </div>

             </div><!--/.fluid-container-->
        </div>
        <!-- end: Content -->
    </div><!--/#content.span10-->
</div><!--/fluid-row-->

    <%@include file="common-footer.jsp"%>

    <script>
        $(function(){
            $.ajax({
                type:"GET",
                async: false,
                url: "http://localhost:8081/alarm/display/status/1",
                dataType : "json",
                success:function(data){
          //          debugger;
                    var datas = eval(data);
                    $.each(datas,function (index, item) {
          //              debugger;
                        var html = '';
                        if(index % 2 == 0)
                            html += '<tr class="text-info">';
                        else
                            html += '<tr class="text-success">';
                        html += '<td>'+ index +'</td>';
                        html += '<td>'+ item.alarmName+ '</td>';
                        html += '<td>'+ item.ipSource +'</td>';
                        html += '<td>'+ item.alarmType +'</td>';
                        html += '<td>'+ item.alarmValue +'</td>';
                        html += '<td>'+ item.alarmLevel +'</td>';
                        html += '</tr>';
                        $("#tbodycontent").append(html);
                    });

                },
                error:function (e) {
                    debugger;
                    alert(e);
                }

            });
        });
    </script>


</body>



</html>
