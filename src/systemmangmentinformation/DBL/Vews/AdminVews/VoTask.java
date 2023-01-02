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
public class VoTask {
    
 private int                  idTask;
 private String               NameTask;
 private String               TimeTaskStart;
 private String              TimeTaskeEnd;
 private DisplayValueModel1  USerID;
 private DisplayValueModel1  MangerID ;

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getNameTask() {
        return NameTask;
    }

    public void setNameTask(String NameTask) {
        this.NameTask = NameTask;
    }

    public String getTimeTaskStart() {
        return TimeTaskStart;
    }

    public void setTimeTaskStart(String TimeTaskStart) {
        this.TimeTaskStart = TimeTaskStart;
    }

    public String getTimeTaskeEnd() {
        return TimeTaskeEnd;
    }

    public void setTimeTaskeEnd(String TimeTaskeEnd) {
        this.TimeTaskeEnd = TimeTaskeEnd;
    }

    public DisplayValueModel1 getUSerID() {
        return USerID;
    }

    public void setUSerID(DisplayValueModel1 USerID) {
        this.USerID = USerID;
    }

    public DisplayValueModel1 getMangerID() {
        return MangerID;
    }

    public void setMangerID(DisplayValueModel1 MangerID) {
        this.MangerID = MangerID;
    }
 
}
