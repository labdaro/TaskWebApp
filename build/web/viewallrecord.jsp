<%-- 
    Document   : home
    Created on : Feb 19, 2020, 7:14:14 PM
    Author     : Daro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${fullname}</h1>
        
        <h1>Hello: ${st}</h1>
        
        <h1>Check: ${check}</h1>  
        
        <%
            String fullname = (String) request.getAttribute("fullname");
            out.print(fullname);
        %>
        
        
        <form action="viewallrecord" method="post">
            
            <input type="submit" value="View all Record">
            
        </form>
        
    </body>
</html>
