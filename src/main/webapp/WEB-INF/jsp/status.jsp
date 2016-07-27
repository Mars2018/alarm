
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
                            <th>ID</th>
                            <th>Alarm Type</th>
                            <th>Alarm Target</th>
                            <th>Statistical Method</th>
                            <th>Alarm Value</th>
                            <th>Judgment Condition</th>
                            <th>Stifle Time(s)</th>
                            <th>Alarm Level</th>
                            <th>Update Time</th>
                        </tr>
                        </thead>
                        <tbody>
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
