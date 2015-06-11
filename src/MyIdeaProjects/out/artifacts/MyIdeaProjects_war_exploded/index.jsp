<%--
  Created by IntelliJ IDEA.
  User: Саманцов
  Date: 11.06.2015
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Today's Date</title>
  </head>
  <%Date date = new Date();%>
  <body>
  <h1>Today's Date</h1>
  <p>Today's Date is <%= date %></p>
  </body>
</html>
