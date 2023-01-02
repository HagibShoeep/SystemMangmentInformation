/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Vews.Information;

import systemmangmentinformation.DBL.Type.DisplayValueModel1;

/**
 *
 * @author shoeep
 */
public class VoMessageHead {
    
private  int                 IdMessage;
private  DisplayValueModel1  IDteacher ; 
private  DisplayValueModel1  IDSchoolFor;
private  DisplayValueModel1  IDVilageFor;
private  String              SubjectCurrentStudy;
    public int getIdMessage() {
        return IdMessage;
    }

    public void setIdMessage(int IdMessage) {
        this.IdMessage = IdMessage;
    }

    public DisplayValueModel1 getIDteacher() {
        return IDteacher;
    }

    public void setIDteacher(DisplayValueModel1 IDteacher) {
        this.IDteacher = IDteacher;
    }

    public DisplayValueModel1 getIDSchoolFor() {
        return IDSchoolFor;
    }

    public void setIDSchoolFor(DisplayValueModel1 IDSchoolFor) {
        this.IDSchoolFor = IDSchoolFor;
    }

    public DisplayValueModel1 getIDVilageFor() {
        return IDVilageFor;
    }

    public void setIDVilageFor(DisplayValueModel1 IDVilageFor) {
        this.IDVilageFor = IDVilageFor;
    }

    public String getSubjectCurrentStudy() {
        return SubjectCurrentStudy;
    }

    public void setSubjectCurrentStudy(String SubjectCurrentStudy) {
        this.SubjectCurrentStudy = SubjectCurrentStudy;
    }

 

  
 
 
}
