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
import java.util.List;
import java.util.Vector;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.Information.VoBranch;
import systemmangmentinformation.DBL.Vews.Information.VoSchool;
/**
 *
 * @author shoeep
 */
public class BranchDB extends VoBranch implements MethodDb<VoBranch>{
    private BranchDB(){
        
    }
     private static BranchDB branchDB;
      public static BranchDB getInnstsnce(){
          
          if(branchDB==null){
              branchDB=new BranchDB();
              
          }
          
          return   branchDB;
      }

     
  


    @Override
    public List<VoBranch> getAllElement() throws Exception {
   String sql="select * from Branch";
            
      ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<VoBranch> voBranch=new Vector<VoBranch>();
  int i=0;
     // VoSchool voSchool1=new VoSchool();
      while(set.next()){i++;
       VoBranch voBranch1=new VoBranch();
       voBranch1.setIDBranch(set.getInt(1));
       voBranch1.setCount(i);
       voBranch1.setNameBranch(set.getString(2));
       voBranch.add(voBranch1);
          }
      
   set.close();
   stetment.close();
   con.closeConnection(con.getConnection());
   return voBranch;
    }

    @Override
    public int insert(VoBranch voBranch) throws Exception {
                ConnectionClasses con=new ConnectionClasses();
                String sql="insert into  Branch(NameBranch) values(?)";           
                 PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
              // insertPrep.setInt(1,voBranch.getIDBranch());
                 insertPrep.setString(1, voBranch.getNameBranch());
                   int count= insertPrep.executeUpdate();
                 insertPrep.cancel();
                con.closeConnection(con.getConnection());

return count;
    }

    @Override
    public int update(VoBranch voBranch) throws Exception {
         int b;     
         String  sql="update Branch set   "
         
         + "   NameBranch=?  where IDBranch="+ voBranch.getIDBranch()+"";
         ConnectionClasses con=new ConnectionClasses();
         PreparedStatement updatePrep=con.getConnection().prepareCall(sql);
         updatePrep.setInt(1, voBranch.getIDBranch());
         updatePrep.setString(2, voBranch.getNameBranch()); 
         b= updatePrep.executeUpdate();
         con.closeConnection(con.getConnection());
         updatePrep.cancel();      
   return b;
    }

    @Override
    public int delete(VoBranch voBranch) throws Exception {
     int count ;
            ConnectionClasses con=new ConnectionClasses();
            String sql="delete Branch where NameBranch='"+voBranch.getNameBranch()+"'";
            PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
            count= insertPrep.executeUpdate();
            insertPrep.cancel();
            con.closeConnection(con.getConnection());
    return count;
    }

    @Override
    public VoBranch search(VoBranch voBranch) throws Exception {
         String sql="";
        if(voBranch.getIDBranch()!= 0){
        sql="select IDBranch , NameBranch  from Branch"
         + "IDBranch="+voBranch.getIDBranch()+"";
        }
       
      ConnectionClasses con=new ConnectionClasses();
      PreparedStatement stetment= con.getConnection().prepareCall(sql);
      ResultSet set=stetment.executeQuery();
      VoBranch voBranch1=new VoBranch();
      while(set.next()){
      voBranch1.setIDBranch(set.getInt(1));
       voBranch1.setNameBranch(set.getString(2));
                       }     
       set.close();
       stetment.close();
       con.closeConnection(con.getConnection());
   return voBranch1; 
    }

    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
