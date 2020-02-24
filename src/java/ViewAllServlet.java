/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import table.dboperation;
import table.employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sotherny
 */
public class ViewAllServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
//        dboperation dbop = new dboperation();
//        List<employee> records = dbop.getAllRecords();
//        request.setAttribute("record", records);
//  response.sendRedirect("viewAll.jsp");
//        PrintWriter out = response.getWriter();
//        System.out.println("in view all servlet");
//        for(employee ele:records){
//            String id = ele.getId();
//            String name = ele.getName();
//            System.out.println(id+" : "+name);
//               
//            out.println("<tr><td>"+id+"</td> <td> "+name+"</td></tr><br>");
//        }
//        
//        
//        response.sendRedirect("viewAll.jsp");
//       
    }

}
