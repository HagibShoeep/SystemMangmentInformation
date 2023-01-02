/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package systemmangmentinformation.DAL;
import static java.lang.Class.forName;
import java.net.URLConnection;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author shoeep
 */
public class ConnectionClasses {


 
 public static Connection getConnection()throws SQLException ,ClassNotFoundException{
 //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
 Connection  con  =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=SystemTechnlogy_Project ;user=Admin;password=sho1;");
    if(con != null){
         return con;
    }
 return null;
 }
    public void closeConnection(Connection con)throws SQLException,ClassNotFoundException{
        
        if(con !=null){
            con.close();
            
        }
    }
   
    
    
    
    
    
}
