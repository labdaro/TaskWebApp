<%-- 
    Document   : viewAll
    Created on : Feb 24, 2020, 2:03:20 AM
    Author     : Sotherny
--%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@page import="table.employee" %>
<%@page import="table.dboperation" %>
<%@page import="java.lang.Iterable" %>
<%@page import="java.sql.ResultSet" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View All</h1>

        <%

          dboperation dbop = new dboperation();
          ResultSet rs = dbop.viewAllRecord();
          while(rs.next()){
              String id = rs.getString(1);
              String name = rs.getString(2);
              out.println("<tr><td>"+id+"</td> <td> "+name+"</td></tr><br>");
          }
   
        %>
    </body>
</html>
