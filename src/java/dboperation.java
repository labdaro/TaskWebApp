
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dboperation { 
     Connection con = null;
     
     //Create the connection to the database 
     public Connection getConnection() throws ClassNotFoundException, SQLException{            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/report";
            String user = "root";
            con = DriverManager.getConnection(url, user, "");       
        return con;
    }
    
     //operation for insert into database
    public boolean insertRegisterFrom(register s) throws ClassNotFoundException, SQLException{
            getConnection();
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
            ps.setString(1, s.getFirstname());
            ps.setString(2, s.getLastname());
            ps.setString(3,s.getUsername());
            ps.setString(4, s.getPassword());
            ps.execute();            
            return true;                    
    }
    
    public boolean validateUsername(String user) throws ClassNotFoundException, SQLException{
        boolean flag = false;
       getConnection();
       Statement s = con.createStatement();
       String sql = String.format("select username from register where username ='%s'",user );
       System.out.println(sql);
       ResultSet checkuser = s.executeQuery(sql);
       System.out.println(checkuser.next());
       if(checkuser.next() == true  ){
            return true;
        }
       return flag;
    }
    
    
    public boolean updataData(String id, String newUsername) throws ClassNotFoundException, SQLException{
        getConnection();
        Statement s = con.createStatement();
        s.executeUpdate("update  employee set username='"+ newUsername+"' where id='"+id+"' ");       
        return true;
    }
    
    //Operation of ViewSingleRecord 
   public ResultSet viewSingleRecord(int id) throws ClassNotFoundException, SQLException{
            getConnection();
            Statement s = con.createStatement();
            ResultSet showAllRecord = s.executeQuery("select * from employee");
           
        return showAllRecord;
    }
}
