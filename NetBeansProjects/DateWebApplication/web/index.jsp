<%-- 
    Document   : index
    Created on : Jun 11, 2015, 12:44:09 PM
    Author     : Саманцов
--%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Today's Date</title>
    </head>
    <%
        Date date = new Date();
    %>
    <body>
        <h1>Today's Date</h1>
        <p>
            Today's Date is <%=date%>
        </p>
    </body>
</html>
