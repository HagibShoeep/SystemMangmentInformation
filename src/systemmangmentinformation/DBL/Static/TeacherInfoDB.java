/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static;

import  systemmangmentinformation.DAL.ConnectionClasses;
import java.util.Date;
import java.sql.*;
import java.util.List;
import java.util.Vector;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.VoTeacher;
import systemmangmentinformation.DPL.Tranceformation.Teacher;


public class TeacherInfoDB extends VoTeacher  implements MethodDb<VoTeacher> {
    private static TeacherInfoDB  teacherInfoDB;
    private  TeacherInfoDB(){ 
                            }
    public static  TeacherInfoDB getInstance(){
        if(teacherInfoDB==null){
         teacherInfoDB=new TeacherInfoDB();
        }
        return teacherInfoDB;
                                               }

    @Override
    public List<VoTeacher> getAllElement() throws Exception {
        
     //     IDTeacher ;
 //private String                NameTeacher;
// private String                DateEmploee;
// private String               Qualifioation  ;
// private String               GetDatevQualifioation;
// private String               Spitcial   ;
// private  String              NameSubject  ;
 //private DisplayValueModel1   IDschoole  
        
         String sql="select IDTeacher ,NameTeacher,DateEmploee,Qualifioation,GetDatevQualifioation,"
                 + "Spitcial,NameSubject,IDschooleTeacher,NameSchool from Teacher "
                + "  join School    on"
                + "   IDschooleTeacher  =   IDschoole";
      ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<VoTeacher> voTeacher=new Vector<VoTeacher>();
      while(set.next()){
       VoTeacher voTeacher1=new VoTeacher();
       voTeacher1.setIDTeacher(set.getInt("IDTeacher"));
       voTeacher1.setNameTeacher(set.getString("NameTeacher"));
       voTeacher1.setDateEmploee(set.getString("DateEmploee"));
       voTeacher1.setQualifioation(set.getString("Qualifioation"));
       voTeacher1.setGetDatevQualifioation(set.getString("GetDatevQualifioation"));
       voTeacher1.setSpitcial(set.getString("Spitcial"));
       voTeacher1.setNameSubject(set.getString("NameSubject"));
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDvilageSchool"), set.getString("NameSchool"));
       voTeacher1.setIDschoole(dis);
       voTeacher.add(voTeacher1);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return voTeacher;
    }

    @Override
    public int insert(VoTeacher t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(VoTeacher t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(VoTeacher t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VoTeacher search(VoTeacher t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DisplayValueModel1> getFkFromTable() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}