
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@include file="common-header.jsp"%>

    <script type="text/javascript">
        $(function () {
            $.ajax({
               type:"GET",
                async: false,
                url: "http://localhost:8081/alarm/display//status/1"
            });
        });
    </script>>
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
                <li><a href="#">Configuration</a></li>
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
                        <caption>Monitor Status</caption>
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>监控IP</th>
                            <th>监控类型</th>
                            <th>监控指标</th>
                            <th>监控状态</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach items="${sessionScope.Emplist}" var="s">
                            <tr>
                                <td>${s.eid }</td>
                                <td>${s.ename}</td>
                                <td>${s.department.dname }</td>
                                <td><a href="delEmp?eid=${s.eid }">删除</a>&nbsp;&nbsp;&nbsp;<a href="updateEmp?eid=${s.eid }">修改</a></td>
                            </tr>
                        </c:forEach>

                        <tr class="active-result">
                            <td>1</td>
                            <td>Alarm Type</td>
                            <td>Alarm Target</td>
                            <td>Statistical Method</td>
                            <td>Alarm Value</td>
                            <td>Judgment Condition</td>
                            <td>Stifle Time(s)</td>
                            <td>Alarm Level</td>
                            <td>Update Time</td>
                        </tr>
                        <tr class="success">
                            <td>2</td>
                            <td>Alarm Type</td>
                            <td>Alarm Target</td>
                            <td>Statistical Method</td>
                            <td>Alarm Value</td>
                            <td>Judgment Condition</td>
                            <td>Stifle Time(s)</td>
                            <td>Alarm Level</td>
                            <td>Update Time</td>
                        </tr>
                        <tr  class="warning">
                            <td>3</td>
                            <td>Alarm Type</td>
                            <td>Alarm Target</td>
                            <td>Statistical Method</td>
                            <td>Alarm Value</td>
                            <td>Judgment Condition</td>
                            <td>Stifle Time(s)</td>
                            <td>Alarm Level</td>
                            <td>Update Time</td>
                        </tr>
                        <tr  class="danger">
                            <td>4</td>
                            <td>Alarm Type</td>
                            <td>Alarm Target</td>
                            <td>Statistical Method</td>
                            <td>Alarm Value</td>
                            <td>Judgment Condition</td>
                            <td>Stifle Time(s)</td>
                            <td>Alarm Level</td>
                            <td>Update Time</td>
                        </tr>
                        <tr>
                            <td><a href="#"><span class="btn-link">Add</span></a></td>

                        </tr>
                        </tbody>
                    </table>
                </div>

             </div><!--/.fluid-container-->
        </div>
        <!-- end: Content -->
    </div><!--/#content.span10-->
</div><!--/fluid-row-->

    <%@include file="common-footer.jsp"%>
</body>
</html>
