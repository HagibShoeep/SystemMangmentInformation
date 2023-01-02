/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import systemmangmentinformation.DAL.ConnectionClasses;

/**
 *
 * @author shoeep
 */
public class SchoolINF {
    

    public  Object[] selectConnditioal(  String sql)throws Exception{
           ConnectionClasses con=new ConnectionClasses();
   
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
   int id= 0;

          String name="";
int idfor=0;
      if(set.next()){
               
             id =  set.getInt(1);
       name =  set.getString(2);  
       idfor=set.getInt(3);
         
      }
    
    
   Object  obj[]={ id , name  };
      set.close();
        con.closeConnection(con.getConnection());
      return  obj;
    }
     public  Object[] selectConnditioall(  String sql)throws Exception{
           ConnectionClasses con=new ConnectionClasses();
   
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
   int id= 0;

          String name="";
 
      if(set.next()){
               
             id =  set.getInt(1);
       name =  set.getString(2);  
         
      }
    
    
   Object  obj[]={ id , name  };
      set.close();
        con.closeConnection(con.getConnection());
      return  obj;
    }
         public  String   selectConnditioalAllName(  String sql)throws Exception{
           ConnectionClasses con=new ConnectionClasses();

      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
    String obj=new String();
   
    
  
     if(set.next()){
        
     obj  +=  set.getString(1);  
         
     }
      set.close();
        con.closeConnection(con.getConnection());
      return  obj;
    } 
    public int update(int ID ,String Name)throws Exception{
        String  sql="update Vialge set "
                + "NameVilage=? where IDvilage="+ID+"";
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
           String sql ="INSERT INTO Vialge(NameVilage) VALUES(?)";
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
        
       insertPrep.setString(1, Name);
       
  boolean b=     insertPrep.execute();
       
       insertPrep.cancel();
           con.closeConnection(con.getConnection());
     
      return b;
    }
   public boolean deleteRow(int id)throws Exception{
       boolean isdelete;
          ConnectionClasses con=new ConnectionClasses();
       String sql="delete Vialge where IDvilage="+id+"";
        PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
           isdelete=     insertPrep.execute();
            insertPrep.cancel();
           con.closeConnection(con.getConnection());
       return isdelete;
   }
}
