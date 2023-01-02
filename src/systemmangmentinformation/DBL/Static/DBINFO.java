/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static;
import systemmangmentinformation.DAL.ConnectionClasses;
import java.sql.*;
import java.sql.DriverManager;
import  java.lang.*;
import java.util.Vector;
/**
 *
 * @author shoeep
 */
public class DBINFO {
    public DBINFO(){
        
    }
  
    public  String selectConnditioal(  String sql)throws Exception{
           ConnectionClasses con=new ConnectionClasses();
   
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
    String n= "";
      if(set.next()){
          
         n= set.getString(2);  
         
      }
      set.close();
        con.closeConnection(con.getConnection());
      return  n;
    }
         public  int   selectConnditioalInt(  String sql)throws Exception{
           ConnectionClasses con=new ConnectionClasses();

      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
    int n= 0;
      if(set.next()){
          
         n= set.getInt(2);  
         
      }
      set.close();
        con.closeConnection(con.getConnection());
      return  n;
    } 
    public int update(int ID ,String Name)throws Exception{
        String  sql="update Branch set "
                + "NamePranch=? where IDBranch="+ID+"";
               ;
        
         ConnectionClasses con=new ConnectionClasses();
           PreparedStatement updatePrep=con.getConnection().prepareCall(sql);
          // updatePrep.setInt(1, ID);
           updatePrep.setString(1, Name);
        int b=         updatePrep.executeUpdate();
          
           con.closeConnection(con.getConnection());
            updatePrep.cancel();
              return b;
    }
          
    public boolean insert(int ID,String Name )throws Exception{
           ConnectionClasses con=new ConnectionClasses();
          // boolean b;
           String sql ="INSERT INTO Branch(IDBranch,NamePranch) VALUES(?,?)";
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
         insertPrep.setInt(1, ID);
       insertPrep.setString(2, Name);
       
  boolean b=     insertPrep.execute();
       
       insertPrep.cancel();
           con.closeConnection(con.getConnection());
     
      return b;
    }
   public boolean deleteRow(int id)throws Exception{
       boolean isdelete;
          ConnectionClasses con=new ConnectionClasses();
       String sql="delete Branch where IDBranch="+id+"";
        PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
           isdelete=     insertPrep.execute();
            insertPrep.cancel();
           con.closeConnection(con.getConnection());
       return isdelete;
   }
    
    
}
