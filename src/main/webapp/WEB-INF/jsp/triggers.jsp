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
                <li><a href="#">Triggers</a></li>
            </ul>
            <div id="cfg" class="scroll-pane">
                <!--配置 Items-->
                <div class="row-fluid sortable">
                    <div class="box span12">
                        <!--header start-->
                        <div class="box-header" data-original-title>
                            <h2><i class="halflings-icon edit"></i><span class="break"></span>Triggers Congifuration</h2>
                            <div class="box-icon">
                                <a href="#" class="btn-setting"><i class="halflings-icon wrench"></i></a>
                                <a href="#" class="btn-minimize"><i class="halflings-icon chevron-up"></i></a>
                                <a href="#" class="btn-close"><i class="halflings-icon remove"></i></a>
                            </div>
                        </div>
                        <!--Header end-->
                        <!--content start-->
                        <div class="box-content">
                            <form class="form-horizontal" id="triggerForm" method="post" action="">
                                <fieldset>
                                    <div class="control-group">
                                        <label class="control-label" for="triggerName">Trigger name</label>
                                        <div class="controls">
                                            <input class="input-xlarge focused" id="triggerName" name="name" type="text">
                                        </div>
                                    </div>

                                    <div class="control-group">
                                        <label class="control-label" for="monitorItem">Monitor Item</label>
                                          <div class="controls">
                                            <select id="monitorItem" name="itemId">
                                            </select>
                                           </div>
                                    </div>

                                    <div class="control-group">
                                        <label class="control-label" for="statisticalMethod" >Statistical Method</label>
                                        <div class="controls">
                                            <select id="statisticalMethod" name="statisticalMethod" data-rel="chosen">
                                                <option value="max" selected='selected'> max </option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="control-group">
                                        <label class="control-label" for="judgmentCondition" >Statistical Method</label>
                                        <div class="controls">
                                            <select id="judgmentCondition" name="judgmentCondition" data-rel="chosen">
                                                <option value="gt" selected='selected'> >= </option>
                                                <option value="lt"> <= </option>
                                                <option value="between"> <= AND >= </option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="control-group">
                                        <label class="control-label" for="parameters">Threshold Value</label>
                                        <div class="controls">
                                            <input class="input-xlarge focused" id="parameters" name="parameters" type="text">
                                        </div>
                                    </div>
                                    <div class="form-actions">
                                        <button type="submit" class="btn btn-primary" id="itemSubmit" onclick="saveTrigger()">Save Trigger</button>
                                        <button class="btn", id="itemCancel", onclick="cancleTrigger()">Cancel</button>
                                    </div>
                                </fieldset>
                            </form>

                        </div>
                        <!--content end-->
                    </div><!--/span-->

                </div><!--/row-->
                <!--配置 Items结束-->


            </div>
            <!-- end: Content -->
        </div><!--/#content.span10-->
    </div><!--/fluid-row-->
</div>

<%@include file="common-footer.jsp"%>
<script>
        var typeData;
        var targetData;
        var itemData
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
                              $("#monitorItem").append(html);

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
        function saveTrigger() {
            //  debugger;
            $.ajax({
                type:'POST',
                async:false,
                url: "http://localhost:8081/alarm/config/trigger/insert",
                data:"["+JSON.stringify(serializeFromToJson($("#triggerForm")))+"]",
                dataType:'json',
                contentType: "application/json;charset=UTF-8",
                success:function (data) {
                    $("#triggerForm").clear;
                    alert("插入成功！");
                },
                error:function (data) {
                    alert("插入失败...."+data);
                }
            })
        }

        function cancleTrigger() {
            $("#triggerForm").clean();
        }


    </script>
</body>
</html>
