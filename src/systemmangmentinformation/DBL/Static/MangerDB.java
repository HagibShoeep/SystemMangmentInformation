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
import systemmangmentinformation.DBL.Vews.VoManger;

/**
 *
 * @author shoeep
 */
public class MangerDB extends VoManger implements MethodDb<VoManger>{
 private static MangerDB mangerDB;
 private MangerDB(){
     
 }
 public static MangerDB getInstance(){
     if(mangerDB==null){
         mangerDB=new MangerDB();
     }
     return mangerDB;
 }
    @Override
    public List<VoManger> getAllElement() throws Exception {
     
               
                        throw new UnsupportedOperationException();
    }

    @Override
    public int insert(VoManger voManger) throws Exception {
          String sql ="insert into Manger(MangerId,MangerName)values (?,?)";
           int count=0;
      ConnectionClasses con=new ConnectionClasses();
      
               
      
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
     
      
     insertPrep.setInt(1,voManger.getIDmanger());
        insertPrep.setString(2,voManger.getMangerName());
      
       count = insertPrep.executeUpdate();
       insertPrep.cancel();
       con.closeConnection(con.getConnection());
      
           
     
     
     
     
   return count;
    }

    @Override
    public int update(VoManger t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(VoManger t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoManger search(VoManger t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
