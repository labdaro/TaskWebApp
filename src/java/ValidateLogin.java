/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sotherny
 */
public class ValidateLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String btn = request.getParameter("btn");
        dboperation dbop = new dboperation();
        System.out.println(username+" : "+password);
        if (btn.equals("login")){
        try {
            System.out.println("dbop.validateLogin(username, password)");
             
            if(dbop.validateLogin(username, password) == true){
                System.out.println(dbop.validateLogin(username, password));
                response.sendRedirect("home.jsp");
            }
            else{
                request.setAttribute("error", "Invalid password or username");
                RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
                rs.forward(request, response);
            }
        }  catch (ClassNotFoundException ex) {
            
                System.out.println(ex);
        } catch (SQLException ex) {
                System.out.println(ex);
        }
  
    }
        else{
            response.sendRedirect("index.jsp");
        }
}
}
