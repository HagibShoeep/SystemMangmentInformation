/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Static;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import systemmangmentinformation.DAL.ConnectionClasses;
import systemmangmentinformation.DBL.Type.DisplayValueModel1;
import systemmangmentinformation.DBL.Type.MethodDb;
import systemmangmentinformation.DBL.Vews.Information.VoSchool;


/**
 *
 * @author shoeep
 */
public class SchoolINFDB extends VoSchool implements MethodDb<VoSchool> {
    
    private SchoolINFDB(){
         
     }
private  static SchoolINFDB  schoolINFDB;

   public  static SchoolINFDB  getInstance(){
       if(schoolINFDB==null){
         schoolINFDB=new   SchoolINFDB() ;
       }
       return schoolINFDB;
   }

     
  
 
   public int  selectedPk1()throws Exception{
   int   count=0;
        ConnectionClasses con=new ConnectionClasses();
       
       String sql ="select  count(*) from  School";
      Statement stetment= con.getConnection().createStatement();
      ResultSet set = stetment.executeQuery(sql);
      
        
  
      if(set.next()){
      count =set.getInt(1);
      }
   
     stetment.cancel();
     set.close();
     con.closeConnection(con.getConnection());

return  count ;
   }

      
   
    @Override
    public  List<VoSchool> getAllElement() throws Exception {
    //  String sql="select * from School ";
     String sql="select IDSchool , IDvilageSchool ,NameVilage , NameSchool from Vialge"
                + "  join School    on"
                + "   IDvilageSchool  =   IDvilage";
      ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<VoSchool> voSchool=new Vector<VoSchool>();
      while(set.next()){
               VoSchool voSchool1=new VoSchool();
       voSchool1.setIDSchool(set.getInt("IDSchool"));
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDvilageSchool"), set.getString("NameVilage"));
       voSchool1.setIDvilage(dis);
       voSchool1.setNameSchool( set.getString("NameSchool"));
       voSchool.add(voSchool1);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return voSchool;
    }

    @Override
    public int insert(VoSchool voSchool) throws Exception {
         ConnectionClasses con=new ConnectionClasses();
        String sql="insert into  School(IDSchool,IDvilageSchool,NameSchool) values(?,?,?)"
                ;
              
      
       PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
        insertPrep.setInt(1,voSchool.getIDSchool());
       insertPrep.setInt(2,Integer.parseInt(voSchool.getIDvilage().valueMember.toString()));
       insertPrep.setString(3, voSchool.getNameSchool());
       int count= insertPrep.executeUpdate();
       insertPrep.cancel();
       con.closeConnection(con.getConnection());
      
           
     
      return count;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(VoSchool voSchool) throws Exception {
   int b;     
         String  sql="update School set   "
                 + "IDSchool=?,"
                 + "   NameSchool=? ,IDvilageSchool=? where IDSchool="+ voSchool.getIDSchool() +"";
         ConnectionClasses con=new ConnectionClasses();
         PreparedStatement updatePrep=con.getConnection().prepareCall(sql);
         updatePrep.setInt(1, voSchool.getIDSchool());
         updatePrep.setString(2, voSchool.getNameSchool());
         updatePrep.setInt(3,Integer.valueOf( voSchool.getIDvilage().valueMember.toString()));
        b= updatePrep.executeUpdate();
        con.closeConnection(con.getConnection());
         updatePrep.cancel();      
   return b;
      
    }

    @Override
    public int delete(VoSchool voSchoool) throws Exception {
    int count ;
            ConnectionClasses con=new ConnectionClasses();
            String sql="delete Schole where NameSchool="+voSchoool.getNameSchool()+"";
            PreparedStatement insertPrep = con.getConnection().prepareStatement(sql);
            count= insertPrep.executeUpdate();
            insertPrep.cancel();
            con.closeConnection(con.getConnection());
    return count;
    }

    @Override
    public VoSchool search(VoSchool voschool) throws Exception {
         String sql="";
        if(voschool.getIDSchool()!= 0){
        sql="select IDSchool , IDvilageSchool ,NameVilage , NameSchool from Vialge"
                + "  join School    on"
                + "   IDvilageSchool  =   IDvilage  where IDSchool="+voschool.getIDSchool()+"";
        }
        else{
            
        sql="select IDSchool , IDvilageSchool ,NameVilage , NameSchool from Vialge"
                + "  join School    on"
                + "   IDvilageSchool  =   IDvilage  where NameSchool='"+voschool.getNameSchool()+"'";  
        }
      ConnectionClasses con=new ConnectionClasses();
      PreparedStatement stetment= con.getConnection().prepareCall(sql);
      ResultSet set=stetment.executeQuery();
  
  
      VoSchool voSchool1=new VoSchool();

      while(set.next()){
                 voSchool1.setIDSchool(set.getInt(1));
                 DisplayValueModel1 dis=new DisplayValueModel1(set.getInt(2), set.getString(3));
                voSchool1.setIDvilage(dis);
               voSchool1.setNameSchool( set.getString(4));
                   }
      
             set.close();
             stetment.close();
   
         con.closeConnection(con.getConnection());
   return voSchool1;
    

}

    @Override
    public List<DisplayValueModel1> getFkFromTable()throws Exception{
        String sql="select  IDvilage ,NameVilage from Vialge ";
   
      ConnectionClasses con=new ConnectionClasses();
      Statement stetment= con.getConnection().createStatement();
      ResultSet set=stetment.executeQuery(sql);
     
      List<DisplayValueModel1> displayValueModel1=new Vector<DisplayValueModel1>();
  
     // VoSchool voSchool1=new VoSchool();

      while(set.next()){
            
      
       DisplayValueModel1 dis=new DisplayValueModel1(set.getInt("IDvilage"), set.getString("NameVilage"));
   
    
       displayValueModel1.add(dis);
          }
      
   set.close();
   stetment.close();

        con.closeConnection(con.getConnection());
   return displayValueModel1;
       
    }
}
