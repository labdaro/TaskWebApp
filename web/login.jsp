<%-- 
    Document   : login
    Created on : Feb 20, 2020, 2:57:45 PM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .error{
                color: red;
            }
        </style>
    </head>
    <body>
        <form action="ValidateLogin" method="post">
            First Name: <input name="username" type="text" placeholder="username" ><br>
            Last Name : <input name="password" type="text" placeholder="password"><br>
            Username  : <input name="btn" type="submit" value="login"><br>
            Password  : <input name="btn" value="register" type="submit">
        </form>
         
        <p class="error">${error}</p>
                
        
    </body>
</html>
