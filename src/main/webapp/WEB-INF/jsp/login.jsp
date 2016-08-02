<%--
  Created by IntelliJ IDEA.
  User: dnbsxs88
  Date: 2016/7/27
  Time: 14:42
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
        <div class="row-fluid">
            <%@include file="common-mainmenu.jsp"%>
            <div class="login-box">
                <div class="icons">
                    <a href="index.html"><i class="halflings-icon home"></i></a>
                    <a href="#"><i class="halflings-icon cog"></i></a>
                </div>
                <h2>Login to your account</h2>
                <form class="form-horizontal" action="index.html" method="post">
                    <fieldset>

                        <div class="input-prepend" title="Username">
                            <span class="add-on"><i class="halflings-icon user"></i></span>
                            <input class="input-large span10" name="username" id="username" type="text" placeholder="type username"/>
                        </div>
                        <div class="clearfix"></div>

                        <div class="input-prepend" title="Password">
                            <span class="add-on"><i class="halflings-icon lock"></i></span>
                            <input class="input-large span10" name="password" id="password" type="password" placeholder="type password"/>
                        </div>
                        <div class="clearfix"></div>

                        <label class="remember" for="remember"><input type="checkbox" id="remember" />Remember me</label>

                        <div class="button-login">
                            <button type="submit" class="btn btn-primary">Login</button>
                        </div>
                        <div class="clearfix"></div>
                    </fieldset>
                </form>
                <hr>

            </div><!--/span-->
        </div><!--/row-->


    </div><!--/.fluid-container-->

</div><!--/fluid-row-->

<%@include file="common-footer.jsp"%>
</body>
</html>
