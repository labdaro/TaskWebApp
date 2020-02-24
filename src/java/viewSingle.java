/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
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
 */
public class viewSingle extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchId = request.getParameter("searchId");
        dboperation operation = new dboperation();
        
        try {
            System.out.println("loading process.....");
            LinkedList dataList = operation.viewSingleRecord(searchId);
            System.out.println(dataList.isEmpty());
            if (dataList.isEmpty()== true){
                       request.setAttribute("error", "You doesn't have the data matching with input id .... Try Again");
                       RequestDispatcher d = request.getRequestDispatcher("viewrecord.jsp");
                        d.forward(request, response);   
            }else{
                
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("hsjdjflasjdfsjdf.....");
            Logger.getLogger(viewSingle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            System.out.println("jasfjlsdfjk wdsjfklsj ===================================");
            Logger.getLogger(viewSingle.class.getName()).log(Level.SEVERE, null, ex);
        }
               
       
        
    }

}
