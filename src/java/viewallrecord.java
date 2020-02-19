/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daro
 */
public class viewallrecord extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      try {               
                     Class.forName("com.mysql.jdbc.Driver");
                     String url = "jdbc:mysql://localhost:3306/report";
                     String userdb = "root";
                     Connection con = DriverManager.getConnection(url, userdb, "");
                     Statement s = con.createStatement();
                    
                    ResultSet result = s.executeQuery("select * from employee");
                    req.setAttribute("check", "Get the data already.....");
                    req.setAttribute("st", result);
                    
                    System.out.println(result);
                                     

          
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
}
