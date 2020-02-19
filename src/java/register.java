

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
 * @author Daro
// */
public class register extends HttpServlet {
//    Connection con = null;
//    public Connection getConnection() throws ClassNotFoundException, SQLException{
//        
//        if (con == null){            
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/report";
//            String user = "root";
//            con = DriverManager.getConnection(url, user, "");   
//        }
//        
//        return con;
//    }
    
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
                     Class.forName("com.mysql.jdbc.Driver");
                     String url = "jdbc:mysql://localhost:3306/report";
                     String userdb = "root";
                     Connection con = DriverManager.getConnection(url, userdb, "");
                     show.print("Connection is ok....");
                    
                     PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
                     ps.setString(1, fname);
                     ps.setString(2,lname);
                     ps.setString(3,user );
                     ps.setString(4, pass1);
                     ps.execute();
                     show.print("insert is ok....");
                     
                     
                    request.setAttribute("fullname", fullname);
                    d = request.getRequestDispatcher("viewallrecord.jsp");
                    d.forward(request, response);
                                     

          
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
