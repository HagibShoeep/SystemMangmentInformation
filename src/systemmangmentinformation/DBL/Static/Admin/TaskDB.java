/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import systemmangmentinformation.DAL.ConnectionClasses;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.AdminVews.VoTask;
/**
 *
 * @author shoeep
 */
public class TaskDB extends  VoTask implements MethodDb<VoTask>{

 private  static TaskDB adminTask;
 private TaskDB(){
     
 }
 public  static  TaskDB getInstanceAdminTask(  ){
     
     if(adminTask == null){
      adminTask  =new TaskDB();
     }
     return adminTask;
 }
    
    

  
    

    @Override
    public int update(VoTask voTask) throws Exception {
             int count=0;
      ConnectionClasses con=new ConnectionClasses();
        String sql="update   Task set"
                + " NameTask=?,TimeTaskStart=?,TimeTaskeEnd=?,USerIDTask=?,MangerIDTask=?"+
                
               " where idTask="+voTask.getIdTask()+"";
              
      
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
     
       insertPrep.setString(1, voTask.getNameTask());
       insertPrep.setString(2, voTask.getTimeTaskStart());
       insertPrep.setString(3, voTask.getTimeTaskeEnd());
        insertPrep.setInt(4,Integer.parseInt(voTask.getUSerID().valueMember.toString()));
       insertPrep.setInt(5,Integer.parseInt(voTask.getMangerID().valueMember.toString()));
       count = insertPrep.executeUpdate();
       insertPrep.cancel();
       con.closeConnection(con.getConnection());
      
           
     
     
     
     
   return count;
      
    }

    @Override
    public List<VoTask> getAllElement() throws Exception {
        List<VoTask> voTask=new Vector<VoTask>();
     String   sql="select NameTask ,idTask,NameTask,MangerId,MangerName,USerIDTask,IDUser,NameUser,MangerIDTas"
             + "";
        ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
      while(set.next()){
               VoTask voTask1=new VoTask();
       voTask1.setNameTask(set.getString("IDSchool"));
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDvilageSchool"), set.getString("NameVilage"));
       voTask1.setUSerID(dis);
       
       voTask1.setTimeTaskStart(set.getString("TimeTaskStart"));
            voTask1.setTimeTaskeEnd(set.getString("TimeTaskeEnd"));
       voTask.add(voTask1);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
        
        return voTask;
    }

    @Override
    public int insert(VoTask voTask) throws Exception {
     int count=0;
      ConnectionClasses con=new ConnectionClasses();
        String sql="insert into  Task(idTask, NameTask,TimeTaskStart,TimeTaskeEnd,USerIDTask,MangerIDTask)"
                + "values(?,?,?,?,?,?)";
                ;
              
      
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
        insertPrep.setInt(1,voTask.getIdTask());
       insertPrep.setString(2, voTask.getNameTask());
       insertPrep.setString(3, voTask.getTimeTaskStart());
       insertPrep.setString(4, voTask.getTimeTaskeEnd());
        insertPrep.setInt(5,Integer.parseInt(voTask.getUSerID().valueMember.toString()));
       insertPrep.setInt(6,Integer.parseInt(voTask.getMangerID().valueMember.toString()));
       count = insertPrep.executeUpdate();
       insertPrep.cancel();
       con.closeConnection(con.getConnection());
      
           
     
     
     
     
   return count;}

    @Override
    public int delete(VoTask t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoTask search(VoTask t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
  String sql="    select IDUser,NameUser from UserEmp";  //To change body of generated methods, choose Tools | Templates.
   
     List<DisplayValueModel1> displayValueModel1=new Vector<>();
     
      ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
      while(set.next()){
     DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDUser"), set.getString("NameUser"));
   displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
        
    
     
    return displayValueModel1;
    }

    
public List<DisplayValueModel1> getFkFromTableManger() throws Exception {
  String sql="    select MangerId,MangerName from Manger";  //To change body of generated methods, choose Tools | Templates.
   
     List<DisplayValueModel1> displayValueModel1=new Vector<>();
     
      ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
      
      while(set.next()){
     DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("MangerId"), set.getString("MangerName"));
   displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
        
    
     
    return displayValueModel1;
    }
   
}
