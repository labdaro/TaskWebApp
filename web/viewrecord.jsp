<%-- 
    Document   : viewrecord
    Created on : Feb 20, 2020, 2:50:44 PM
    Author     : Daro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
            .empty{
                color: red;
            }
        </style>
    </head>
    <body>
        <h1>Hello World! View Record</h1>
        <form action="viewSingle" method="post">
            <input type="text" name="searchId">
            <input type="submit" value="Search">
        </form>
        <p class="empty">${error}</p> 
        
    </body>
</html>
