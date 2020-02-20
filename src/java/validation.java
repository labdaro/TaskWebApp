

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class validation extends HttpServlet {    
    RequestDispatcher d = null;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter show = response.getWriter();
         String pass1 = request.getParameter("pass1");
         String pass2 = request.getParameter("pass2");
         String user = request.getParameter("user");
         String fname = request.getParameter("firstname");
         String lname = request.getParameter("lastname");
         String fullname = fname + lname;
         
         
        
       
            
        if (pass1.equals(pass2)){
            if (pass1.length() > 8){
                try {  
                    //Create object for model
                    register data = new register();                  
                    data.setFirstname(fname);
                    data.setLastname(lname);
                    data.setUsername(user);
                    data.setPassword(pass1);                   
                   
                    //create object for dboperation
                    dboperation obj = new dboperation();
                    if (obj.validateUsername(user)== true){
                        request.setAttribute("sameuser", "user is already existing ....");
                        d = request.getRequestDispatcher("index.jsp");
                        d.forward(request, response);                     
                    }
                    
                    if(obj.insertRegisterFrom(data)){ 
                        System.out.println("Insert is ok......");
                        response.sendRedirect("viewrecord.jsp");
                    
                    }
                    
                                           
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                }
                  
            }
            else{
                System.out.println("Your Password must have length more 8 character...");
                request.setAttribute("error", "Your Password must have length more 8 character...");
                 d = request.getRequestDispatcher("index.jsp");
                 d.forward(request, response);
            }
        }
        
        else{
            System.out.println("Your password not matching......");
            show.print("Your password not matching......");
            request.setAttribute("error", "Your password not matching...... ");
            d = request.getRequestDispatcher("index.jsp");
            d.forward(request, response);
        }
       
    }
}
