<%--
  Created by IntelliJ IDEA.
  User: dnbsxs88
  Date: 2016/7/27
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="common-header.jsp"%>
    <script src="bootstrap/js/jquery-1.9.1.min.js"></script>
    <script>
        $(function () {
            var datas;
            $.ajax({
                type:"GET",
                url: "http://localhost:8081/alarm/monitor/query/monitorType",
                dataType : "json",
                success:function(data){
                    debugger;
                    datas = eval(data);
                    debugger;
                },
                error:function (e) {
                    debugger;
                    alert(e);
                }

            });
            $("#monitorTarget").click(function () {

                $.each(datas,function (index, item) {
                    var html = '';
                    if(item.type_id == $("#monitorType").val( )) {
                        debugger;
                        html += '<option value=' + item.id + '>' + item.name + '</option>';
                        $("#monitorTarget").append(html);
                    }
                });
            });
        });
        function serializeFromToJson($selector) {
            var o = {};
            var a = $selector.serializeArray();
            $.each(a, function() {
                if (o[this.name]) {
                    if (!o[this.name].push) {
                        o[this.name] = [ o[this.name] ];
                    }
                    o[this.name].push(this.value || '');
                } else {
                    o[this.name] = this.value || '';
                }
            });
            return o;
        }
        function saveService() {
            //  debugger;
            $.ajax({
                type:'POST',
                async:false,
                url: "http://localhost:8081/alarm/config/service/insert",
                data:"["+JSON.stringify(serializeFromToJson($("#hostForm")))+"]",
                dataType:'json',
                contentType: "application/json;charset=UTF-8",
                success:function (data) {
                    $("#hostForm").clear;
                    alert("插入成功！");
                },
                error:function (data) {
                    alert("插入失败...."+data);
                }
            })
        }

        function cancleService() {
            $("#hostForm").clean();
        }

        function loadMonitorType(){
            var mySelect = document.getElementById("monitorType");
            debugger;
            $.ajax({
                type:"GET",
                url: "http://localhost:8081/alarm/monitor/query/monitorType",
                dataType : "json",
                success:function(data){
                    debugger;
                    var datas = eval(data);
                    $.each(datas,function (index, item) {
                        debugger;
                        var html = '';
                        html += '<option value='+ item.id+'>'+item.name+'</option>';
                        $("#monitorType").append(html);
                    });

                },
                error:function (e) {
                    debugger;
                    alert(e);
                }

            });

        }

        function loadMonitorTarget() {
            debugger;
            $.ajax({
                type:"GET",
                url: "http://localhost:8081/alarm/monitor/query/monitorTarget",
                dataType : "json",
                success:function(data){
                    debugger;
                    var datas = eval(data);
                    var type = $("#monitorType").val();
                    $.each(datas,function (index, item) {
                        debugger;
                        var html = '';
                        if(item.typeId == type) {
                            html += '<option value=' + item.id + '>' + item.name + '</option>';
                            $("#monitorTarget").append(html);
                        }
                    });

                },
                error:function (e) {
                    debugger;
                    alert(e);
                }

            });

        }

        function saveItem() {

        }

        function cancleItem() {

        }

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
                <li><a href="#">Services</a></li>
            </ul>
            <div id="cfg" class="scroll-pane">
                <!--配置host-->
                <div class="row-fluid sortable">
                    <div class="box span12">
                        <!--header start-->
                        <div class="box-header" data-original-title>
                            <h2><i class="halflings-icon edit"></i><span class="break"></span>Service Congifuration</h2>
                            <div class="box-icon">
                                <a href="#" class="btn-setting"><i class="halflings-icon wrench"></i></a>
                                <a href="#" class="btn-minimize"><i class="halflings-icon chevron-up"></i></a>
                                <a href="#" class="btn-close"><i class="halflings-icon remove"></i></a>
                            </div>
                        </div>
                        <!--Header end-->
                        <!--content start-->
                        <div class="box-content">
                            <form class="form-horizontal" id="hostForm" method="post" action="">
                                <fieldset>

                                    <div class="control-group">
                                        <label class="control-label" for="host">Host</label>
                                        <div class="controls">
                                            <select id="host" name="hostId" data-rel="chosen">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="trigger">Trigger</label>
                                        <div class="controls">
                                            <select id="trigger" name="triggerId" data-rel="chosen">
                                            </select>
                                        </div>
                                    </div>

                                    <div class="control-group">
                                        <label class="control-label" for="serviceStart">Start</label>
                                        <div class="controls">
                                            <input class="input-xlarge focused" id="serviceStart" name="serviceStart" type="text">
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="serviceEnd">End</label>
                                        <div class="controls">
                                            <input class="input-xlarge focused" id="serviceEnd" name="ip" type="text">
                                        </div>
                                    </div>

                                    <div class="control-group">
                                        <label class="control-label" for="dependience">Dependencies</label>
                                        <div class="controls">
                                            <select id="dependience" name="dependience" data-rel="chosen">
                                            </select>
                                        </div>
                                    </div>

                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-primary" id="serviceSubmit" onclick="saveService()">Save Service</button>
                                        <button class="btn", id="serveceCancel", onclick="cancleService()">Cancel</button>
                                    </div>
                                </fieldset>
                            </form>

                        </div>
                        <!--content end-->
                    </div><!--/span-->

                </div><!--/row-->
                <!--配置host结束-->
            </div>
            <!-- end: Content -->
        </div><!--/#content.span10-->
    </div>
</div><!--/fluid-row-->


<%@include file="common-footer.jsp"%>
</body>
</html>
