/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Vews.AdminVews;

import systemmangmentinformation.DBL.Type.DisplayValueModel1;

/**
 *
 * @author shoeep
 */
public class VoAdminsUsersTask {

    public int getRecordID() {
        return RecordID;
    }

    public void setRecordID(int RecordID) {
        this.RecordID = RecordID;
    }
    private       int                   RecordID  ;                   
   private   DisplayValueModel1        IdUser;
   private   DisplayValueModel1        TaskId;
   private  DisplayValueModel1         IDTaskManger;
   private  String                     TypeTasckManger;
   private  DisplayValueModel1         TypeID;

    public DisplayValueModel1 getIdUser() {
        return IdUser;
    }

    public void setIdUser(DisplayValueModel1 IdUser) {
        this.IdUser = IdUser;
    }

    public DisplayValueModel1 getTaskId() {
        return TaskId;
    }

    public void setTaskId(DisplayValueModel1 TaskId) {
        this.TaskId = TaskId;
    }

    public DisplayValueModel1 getIDTaskManger() {
        return IDTaskManger;
    }

    public void setIDTaskManger(DisplayValueModel1 IDTaskManger) {
        this.IDTaskManger = IDTaskManger;
    }

    public String getTypeTasckManger() {
        return TypeTasckManger;
    }

    public void setTypeTasckManger(String TypeTasckManger) {
        this.TypeTasckManger = TypeTasckManger;
    }

    public DisplayValueModel1 getTypeID() {
        return TypeID;
    }

    public void setTypeID(DisplayValueModel1 TypeID) {
        this.TypeID = TypeID;
    }
    
            
}
