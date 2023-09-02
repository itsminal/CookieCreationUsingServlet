<%-- 
    Document   : fetch
    Created on : Sep 2, 2023, 8:26:35 PM
    Author     : MINAL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="index.html" %>
        <h1>Fetching Cookies</h1>
        <%
            Cookie cookie = null;
            Cookie[] cookies = null;
            cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    out.print("Name : " + cookie.getName() + ",  ");
                    out.print("Value: " + cookie.getValue() + " <br/>");
                }
            } 
            else{
                    out.println("<h2>No cookies founds</h2>");
                }
 %>
    </body>
</html>
