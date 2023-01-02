/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import systemmangmentinformation.DAL.ConnectionClasses;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.VoUpdateRole;

/**
 *
 * @author shoeep
 */
public class UpdateRoleDB extends VoUpdateRole implements MethodDb<VoUpdateRole> {
    private static UpdateRoleDB updateRoleDB;
    private  UpdateRoleDB(){
        
    }
  public static UpdateRoleDB getInstance(){
      if(updateRoleDB==null){
          updateRoleDB=new UpdateRoleDB();
      }
      return updateRoleDB;
  }
    @Override
    public List<VoUpdateRole> getAllElement() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(VoUpdateRole voUpdateRole ) throws Exception {
        int count=0;
      ConnectionClasses con=new ConnectionClasses();
        String sql="insert into  UserEmpType(IDUser, IDTypeUser,Department,NmeRole) values(?,?,?,?)";
               
      
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
     
      
     insertPrep.setInt(1,Integer.parseInt(voUpdateRole.getIdRole().valueMember.toString()));
        insertPrep.setInt(2,Integer.parseInt(voUpdateRole.getIDTypeUser().valueMember.toString()));
       insertPrep.setInt(3,Integer.parseInt(voUpdateRole.getDepartment().valueMember.toString()));
        insertPrep.setString(4, voUpdateRole.getNmeRole());
       count = insertPrep.executeUpdate();
       insertPrep.cancel();
       con.closeConnection(con.getConnection());
      
           
     
     
     
     
   return count;
      
    }

    @Override
    public int update(VoUpdateRole t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(VoUpdateRole t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoUpdateRole search(VoUpdateRole t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
        //To change body of generated methods, choose Tools | Templates.
         String sql="select IDDept,NameDepart from Deprtment";
             ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<DisplayValueModel1> displayValueModel1=new Vector<DisplayValueModel1>();
  
     // VoSchool voSchool1=new VoSchool();

      while(set.next()){
            
      
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDDept"), set.getString("NameDepart"));
   
    
       displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return displayValueModel1;
    }
       public List<DisplayValueModel1> getFkFromTableType() throws Exception {
           String sql="select IDTypeUser,NameTypeUser from TypeUser";
             ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<DisplayValueModel1> displayValueModel1=new Vector<DisplayValueModel1>();
  
     // VoSchool voSchool1=new VoSchool();

      while(set.next()){
            
      
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDTypeUser"), set.getString("NameTypeUser"));
   
    
       displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return displayValueModel1;
        
    }
          public List<DisplayValueModel1> getFkFromTableUsers() throws Exception {
       
          String sql="select IDUser,NameUser from UserEmp";
             ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<DisplayValueModel1> displayValueModel1=new Vector<DisplayValueModel1>();
  
     // VoSchool voSchool1=new VoSchool();

      while(set.next()){
            
      
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDUser"), set.getString("NameUser"));
   
    
       displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return displayValueModel1;
    }
}
