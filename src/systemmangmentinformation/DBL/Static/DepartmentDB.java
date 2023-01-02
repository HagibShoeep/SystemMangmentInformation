/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static;

import java.sql.PreparedStatement;
import java.util.List;
import systemmangmentinformation.DAL.ConnectionClasses;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.VoDepartment;

/**
 *
 * @author shoeep
 */
public class DepartmentDB extends VoDepartment implements MethodDb<VoDepartment>{
    private static DepartmentDB departmentDB;
 public  static DepartmentDB getInstance(){
    if(departmentDB==null){
        departmentDB=new DepartmentDB();
    }
    return departmentDB;
}
private DepartmentDB(){
    
}
    @Override
    public List<VoDepartment> getAllElement() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(VoDepartment voDepartment) throws Exception {
        String sql="insert into Deprtment(IDDept,NameDepart,DateStart) values (?,?,?)";
       int count=0;
      ConnectionClasses con=new ConnectionClasses();
      
               
      
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
     
      
     insertPrep.setInt(1,voDepartment.getIDDept());
        insertPrep.setString(2,voDepartment.getNameDepart());
       insertPrep.setString(3,voDepartment.getDateStart());
       count = insertPrep.executeUpdate();
       insertPrep.cancel();
       con.closeConnection(con.getConnection());
      
           
     
     
     
     
   return count; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(VoDepartment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(VoDepartment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoDepartment search(VoDepartment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
