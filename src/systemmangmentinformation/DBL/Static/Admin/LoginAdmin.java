/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static.Admin;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import systemmangmentinformation.DAL.ConnectionClasses;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.AdminVews.VoLoginAdmin;
/**
 *
 * @author shoeep
 */
public class LoginAdmin extends VoLoginAdmin   implements MethodDb<VoLoginAdmin>{
    private  static LoginAdmin loginAdmin;
     public  static LoginAdmin         getInstanceLoginAdmin(){
         if(loginAdmin==null){
             loginAdmin=new LoginAdmin();
             return loginAdmin;
         }
       
        return loginAdmin;
     }
  private LoginAdmin(){
             
             
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
  
        
        
 return  voLoginAdmin;}


    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
