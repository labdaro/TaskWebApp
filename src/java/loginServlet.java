
import table.dboperation;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginServlet extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("hello login servlet");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String click = request.getParameter("btn");
        dboperation dbop = new dboperation();    
        System.out.println("click = "+click);
        
        boolean flag = false ;
        
    if(click.equals("login")){
        try {
            boolean validation = dbop.validateLogin(username, password);
            System.out.println(validation);
            
            if(validation == true){
//                HttpSession ses = request.getSession();
//                ses.setAttribute("flag", true);
                System.out.println("successful login");
                response.sendRedirect("home.jsp");
                
            }
            else{
                request.setAttribute("error","Invalid username or password");
                System.out.println("fail login");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    else if(click.equals("register")){
            response.sendRedirect("index.jsp");
    }
//    else{
//        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//        rd.include(request, response);
//    }
    
    
    
    
    
    }

}
