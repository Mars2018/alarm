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
                            <form class="form-horizontal" id="serviceForm" method="post" action="">
                                <fieldset>

                                    <div class="control-group">
                                        <label class="control-label" for="host">Host</label>
                                        <div class="controls">
                                            <select id="host" name="hostId" >
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="item">Item</label>
                                        <div class="controls">
                                           <select id="item" name="itemId" >
                                           </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="trigger">Trigger</label>
                                        <div class="controls">
                                            <select id="trigger" name="triggerId">
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="status">Enable</label>
                                        <div class="controls">
                                            <select id="status" name="status" data-rel="chosen">
                                                <option value="1" selected='selected'>是</option>
                                                <option value="0">否</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="serviceStart">Start(yyyy-MM-dd HH:mm:ss)</label>
                                        <div class="controls">
                                            <input class="input-xlarge focused" id="serviceStart" name="serviceStart" type="text">
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="serviceEnd">End(yyyy-MM-dd HH:mm:ss)</label>
                                        <div class="controls">
                                            <input class="input-xlarge focused" id="serviceEnd" name="serviceEnd" type="text">
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="serviceActive">Other(e.g wd:1-7)</label>
                                        <div class="controls">
                                            <input class="input-xlarge focused" id="serviceActive" name="serviceActive" type="text">
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="dependencies">Dependencies</label>
                                        <div class="controls">
                                            <select id="dependencies" name="dependence">
                                            <option value=''>无</option>
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
<script>
        var hostData;
        var itemData;
        var triggerData;
        var serviceData;
        $(document).ready(function () {
           $.ajax({
               type:"GET",
               url: "http://localhost:8081/alarm/monitor/query/monitorHost",
               dataType : "json",
               success:function(data){
                  debugger;
                  hostData = eval(data);
                  debugger;
                  $.each(hostData,function (index, item) {
                      debugger;
                       var html = '';
                       html += '<option value=' + item.hostId + '>' + item.hostName + '</option>';
                       $("#host").append(html);

                   });
               },
               error:function (e) {
                  debugger;
                  alert(e);
               }

           });
        });
        $(document).ready(function () {
           $.ajax({
               type:"GET",
               url: "http://localhost:8081/alarm/monitor/query/monitorItem",
               dataType : "json",
               success:function(data){
                  debugger;
                  itemData = eval(data);
                  debugger;
                  $.each(itemData,function (index, item) {
                      debugger;
                       var html = '';
                       html += '<option value=' + item.itemId + '>' + item.itemName + '</option>';
                       $("#item").append(html);

                   });
               },
               error:function (e) {
                  debugger;
                  alert(e);
               }

           });
        });
        $(document).ready(function () {
           $.ajax({
               type:"GET",
               url: "http://localhost:8081/alarm/monitor/query/monitorTrigger",
               dataType : "json",
               success:function(data){
                  debugger;
                  triggerData = eval(data);
                  debugger;
                  $.each(triggerData,function (index, item) {
                      debugger;
                       var html = '';
                       html += '<option value=' + item.triggerId + '>' + item.name + '</option>';
                       $("#trigger").append(html);

                   });
               },
               error:function (e) {
                  debugger;
                  alert(e);
               }

           });
        });
        $(document).ready(function () {
           $.ajax({
               type:"GET",
               url: "http://localhost:8081/alarm/monitor/query/monitorService",
               dataType : "json",
               success:function(data){
                  debugger;
                  serviceData = eval(data);
                  debugger;
                  $.each(serviceData,function (index, item) {
                      debugger;
                       var html = '';
                       html += '<option value=' + item.serviceId + '>' + item.serviceId + '</option>';
                       $("#dependencies").append(html);

                   });
               },
               error:function (e) {
                  debugger;
                  alert(e);
               }

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
                data:JSON.stringify(serializeFromToJson($("#serviceForm"))),
                dataType:'json',
                contentType: "application/json;charset=UTF-8",
                success:function (data) {
                    $("#serviceForm").clear;
                    alert("插入成功！");
                },
                error:function (data) {
                    alert("插入失败...."+data);
                }
            })
        }

        function cancleService() {
            $("#sericeForm").clean();
        }
    </script>

</body>
</html>
