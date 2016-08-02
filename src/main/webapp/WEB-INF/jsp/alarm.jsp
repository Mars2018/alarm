<%--
  Created by IntelliJ IDEA.
  User: dnbsxs88
  Date: 2016/8/2
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.htsc.alarm.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>alarm</title>
</head>
<body>

<c:forEach items="${alarms}" var="alarm">
    ${alarm.ipSource}<br>
    ${alarm.alarmType}<br>
    ${alarm.alarmName}<br>

</c:forEach>


</body>
</html>
