<%-- 
    Document   : index
    Created on : Feb 19, 2020, 10:44:56 AM
    Author     : Daro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            .checkError{
                color: red;
            }
            .checkuser{
                color: red;
            }
            
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="validation" method="post">
            
            Firstname:   <input type="text" name="firstname" required> <br>
            Lastname:   <input type="text" name="lastname" required> <br>
            Username:   <input type="text" name="user" required> <br> 
           
            Password: <input type="password" name="pass1" required> <br>
            Confirm-password <input type="password" name ="pass2" required> <br>
                    
            <input type="submit" value="register">
     
        
        </form>
        <%--
         <%  
            String show1 = (String) request.getAttribute("sameuser");
            if (show1 != null){
                out.print(show1);
            }
          %> 
            <%  
            String show = (String) request.getAttribute("error");
            if (show != null){
                out.print(show);
            }
          %> --%>
          
           <p class="checkuser">           
            <%  String show1 = (String) request.getAttribute("sameuser");
            if (show1 != null){
                out.print(show1);
            }%>
        </p>
        <p class="checkError">${error}</p>
            
     
            
     
    </body>
</html>
