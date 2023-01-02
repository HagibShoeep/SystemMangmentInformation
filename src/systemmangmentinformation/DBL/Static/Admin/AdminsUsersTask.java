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
import systemmangmentinformation.DBL.Vews.AdminVews.VoAdminsUsersTask;
/**
 *
 * @author shoeep
 */
public class AdminsUsersTask  implements MethodDb<VoAdminsUsersTask> {

   

 private static AdminsUsersTask adminsUsersTask;
 private AdminsUsersTask(){
     
 }
 public static   AdminsUsersTask  getInstance(){
    if(adminsUsersTask==null){
        
        adminsUsersTask=new AdminsUsersTask();
    }
    return adminsUsersTask;
    
}
    
   

  
  

   

    @Override
    public List<VoAdminsUsersTask> getAllElement() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(VoAdminsUsersTask voAdminsUsersTask) throws Exception {
        int count=0;
        String sql="insert into TaskUser(IdUser,TaskId,IDTaskManger,TypeTasckManger,TypeID) values(?,?,?,?,?)";
          ConnectionClasses con=new ConnectionClasses();
         PreparedStatement updatePrep=con.getConnection().prepareCall(sql);
      //   updatePrep.setInt(1, voAdminsUsersTask.getRecordID());
         updatePrep.setInt(1, Integer.parseInt(voAdminsUsersTask.getIdUser().valueMember.toString()));
           updatePrep.setInt(2, Integer.parseInt(voAdminsUsersTask.getTaskId().valueMember.toString()));
             updatePrep.setInt(5, Integer.parseInt(voAdminsUsersTask.getTypeID().valueMember.toString()));
               updatePrep.setInt(3, Integer.parseInt(voAdminsUsersTask.getIDTaskManger().valueMember.toString()));
         updatePrep.setString(4, voAdminsUsersTask.getTypeTasckManger());
        
       count = updatePrep.executeUpdate();
        con.closeConnection(con.getConnection());
         updatePrep.cancel();  
       return count;
    }

    @Override
    public int update(VoAdminsUsersTask voAdminsUsersTask) throws Exception {
        int count=0;
         String sql="update  TaskUser set IdUser=?,TaskId=?,IDTaskManger=?,TypeTasckManger=?,TypeID=?"
                 + "where RecordID= "+voAdminsUsersTask.getRecordID()+"";
         ConnectionClasses con=new ConnectionClasses();
         PreparedStatement updatePrep=con.getConnection().prepareCall(sql);
        // updatePrep.setInt(1, voAdminsUsersTask.getRecordID());
         updatePrep.setInt(1, Integer.parseInt(voAdminsUsersTask.getIdUser().valueMember.toString()));
           updatePrep.setInt(2, Integer.parseInt(voAdminsUsersTask.getTaskId().valueMember.toString()));
             updatePrep.setInt(5, Integer.parseInt(voAdminsUsersTask.getTypeID().valueMember.toString()));
               updatePrep.setInt(3, Integer.parseInt(voAdminsUsersTask.getIDTaskManger().valueMember.toString()));
         updatePrep.setString(4, voAdminsUsersTask.getTypeTasckManger());
       count = updatePrep.executeUpdate();
        con.closeConnection(con.getConnection());
         updatePrep.cancel();  
       return count;
       
    }

    @Override
    public int delete(VoAdminsUsersTask t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoAdminsUsersTask search(VoAdminsUsersTask t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public  List<VoAdminsUsersTask> getUsers( ) throws Exception{
    List<VoAdminsUsersTask> users=new Vector<>();
    String sql="select IDUser,NameUser  from UserEmp join TaskUser  on IDUser = IdUser ";//where TaskId= "+Integer.parseInt(vo.getTaskId().valueMember.toString())+"";
            
            
             ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     while(set.next()){
            
     
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt(" IDUser "), set.getString("NameUser"));
   VoAdminsUsersTask task=new VoAdminsUsersTask();
   task.setIdUser(dis);
    users.add(task);
       
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
    return users;
}

    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
        String sql="select idTask,NameTask from Task";
             ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<DisplayValueModel1> displayValueModel1=new Vector<DisplayValueModel1>();
  
     // VoSchool voSchool1=new VoSchool();

      while(set.next()){
            
      
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("idTask"), set.getString("NameTask"));
   
    
       displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return displayValueModel1;
       
    }
      public List<DisplayValueModel1> getFkFromUser() throws Exception {
          
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
       public List<DisplayValueModel1> getFkFromTypeID() throws Exception {
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
        public List<DisplayValueModel1> getFkFromMangerID() throws Exception {
       String sql="select MangerId,MangerName from Manger";
             ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<DisplayValueModel1> displayValueModel1=new Vector<DisplayValueModel1>();
  
     // VoSchool voSchool1=new VoSchool();

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
