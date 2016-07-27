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
                <li><a href="#">Configuration</a></li>
            </ul>
            <div id="cfg" class="scroll-pane">
                <div id="hosts">
            </div>


        </div>
        <!-- end: Content -->
    </div><!--/#content.span10-->
</div><!--/fluid-row-->


<%@include file="common-footer.jsp"%>
</body>
</html>
