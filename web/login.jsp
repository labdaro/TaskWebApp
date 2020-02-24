<%-- 
    Document   : login
    Created on : Feb 20, 2020, 10:29:25 PM
    Author     : Sotherny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <style>
            .error{
                color: red;
            }
        </style>
    </head>
    <body>
        <form method="post" action="loginServlet">
            Username: <input type="text" name="username" placeholder="username"><br>
            Password: <input type="text" name="password" placeholder="password"><br>
            <input type="submit" name="btn" value="login">
            <input type="submit" name="btn" value="register">
        </form>
        <p class="error">${error}</p>
        
            <!--<input name="view all" type="submit" value="view all">-->
            <a href = "viewAll.jsp">viewall</a>
        
    </body>
</html>
