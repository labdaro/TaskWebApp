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
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="register" method="post">
            
            Firstname:   <input type="text" name="firstname"> <br>
            Lastname:   <input type="text" name="lastname"> <br>
            Username:   <input type="text" name="user"> <br> 
           
            Password: <input type="text" name="pass1"> <br>
            Confirm-password <input type="text" name ="pass2"> <br>
                    
            <input type="submit" value="register">
     
        
        </form>
            <%  
            String show = (String) request.getAttribute("error");
            if (show != null){
                out.print(show);
            }
          %> 
            
     
    </body>
</html>
