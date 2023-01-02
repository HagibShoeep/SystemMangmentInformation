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
import systemmangmentinformation.DBL.Vews.AdminVews.VoLoginAdmin;

/**
 *
 * @author shoeep
 */
public class LoginSystemDB extends VoLoginAdmin implements MethodDb<VoLoginAdmin>{
 private static LoginSystemDB loginSystemDB;
 private LoginSystemDB(){
     
 }
 public static LoginSystemDB getInstance(){
     if(loginSystemDB==null){
         loginSystemDB=new LoginSystemDB();
     }
     
     return loginSystemDB;
 }
    @Override
    public List<VoLoginAdmin> getAllElement() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(VoLoginAdmin t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(VoLoginAdmin t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(VoLoginAdmin t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    
    
    public VoLoginAdmin search(VoLoginAdmin voLoginAdmin) throws Exception {
        String sql="select * from UserEmp"
                + "where NameUser=?";// "+"'"+voLoginAdmin.getNameUser()+"'"+" AND Password ="+"'"+
              // voLoginAdmin.getPassword() +"'";
         ConnectionClasses con=new ConnectionClasses();
        PreparedStatement stetment= con.getConnection().prepareStatement(sql);
           stetment.setString(1, voLoginAdmin.getNameUser());
       
      ResultSet set=stetment.executeQuery();
  
    
        VoLoginAdmin voLoginAdmin1=new VoLoginAdmin();
        
        if(set.next()){
            voLoginAdmin1.setNameUser(set.getString("NameUser"));
            voLoginAdmin1.setPassword(set.getString("Password"));
        }
        set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
        return voLoginAdmin1;
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
   return displayValueModel1;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
  public VoLoginAdmin searchADD(VoLoginAdmin voLoginAdmin) throws Exception {
        String sql="select * from UserEmp where NameUser=?";
              //  + "where NameUser=?";// "+"'"+voLoginAdmin.getNameUser()+"'"+" AND Password ="+"'"+
              // voLoginAdmin.getPassword() +"'";
         ConnectionClasses con=new ConnectionClasses();
        PreparedStatement stetment= con.getConnection().prepareStatement(sql);
           stetment.setString(1, voLoginAdmin.getNameUser());
       
      ResultSet set=stetment.executeQuery();
  
    
        VoLoginAdmin voLoginAdmin1=new VoLoginAdmin();
        
        if(set.next()){
            voLoginAdmin1.setNameUser(set.getString("NameUser"));
            voLoginAdmin1.setPassword(set.getString("Password"));
        }
        set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
        return voLoginAdmin1;
    }
   
   public boolean intcheck(VoLoginAdmin voLoginAdmin,int check) throws Exception {
       if(check>5){
           return false;
       }
 VoLoginAdmin vo=      searchADD(voLoginAdmin);
     if(vo.getPassword().equals(voLoginAdmin.getPassword())){
       
       return true;
   }
    return false;
    } 
    
    
}
