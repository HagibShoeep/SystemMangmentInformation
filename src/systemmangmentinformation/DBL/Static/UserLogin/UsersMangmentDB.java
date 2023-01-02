/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static.UserLogin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import systemmangmentinformation.DAL.ConnectionClasses;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.MangmentUsers.VoUsersMangment;

/**
 *
 * @author shoeep
 */
public class UsersMangmentDB extends VoUsersMangment implements MethodDb<VoUsersMangment>{
private static UsersMangmentDB usersMangmentDB;
private UsersMangmentDB(){
    
}
public static UsersMangmentDB getInstance(){
    if(usersMangmentDB==null)
        usersMangmentDB=new UsersMangmentDB();
    return usersMangmentDB;
}
    @Override
    public List<VoUsersMangment> getAllElement() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(VoUsersMangment voUsersMangment) throws Exception {
 String sql=    "insert into UserEmp(NameUser,Password,IDEmp,typeID) values(?,?,?,?)"; //To change body of generated methods, choose Tools | Templates.
    
      ConnectionClasses con=new ConnectionClasses();
     PreparedStatement preprd= con.getConnection().prepareStatement(sql);
     preprd.setString(1,voUsersMangment.getNameUser() );
     preprd.setString(2,voUsersMangment.getPassword());
     preprd.setInt(3,Integer.parseInt(voUsersMangment.getIDEmp().valueMember.toString()));
          preprd.setInt(4,Integer.parseInt(voUsersMangment.getTypeID().valueMember.toString()));
      int count=preprd.executeUpdate();
    
     
      
   
   preprd.close();
  con.closeConnection(con.getConnection()); 
return count;
    
    }

    @Override
    public int update(VoUsersMangment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(VoUsersMangment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoUsersMangment search(VoUsersMangment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
               String sql="select  idEmploy ,NameEmploy from Employ ";
   
      ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<DisplayValueModel1> displayValueModel1=new Vector<DisplayValueModel1>();
  
     // VoSchool voSchool1=new VoSchool();

      while(set.next()){
            
      
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("idEmploy"), set.getString("NameEmploy"));
   
    
       displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return displayValueModel1;

    }
      public List<DisplayValueModel1> getFkFromTableTypeUsers() throws Exception {
                 String sql="select  IDTypeUser ,NameTypeUser from TypeUser ";
   
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
    
    
    
    
}
