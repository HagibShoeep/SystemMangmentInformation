/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Vews;

import systemmangmentinformation.DBL.Type.DisplayValueModel1;

/**
 *
 * @author shoeep
 */
public class VoTeacher {
 private int                   IDTeacher ;
 private String                NameTeacher;
 private String                DateEmploee;
 private String               Qualifioation  ;
 private String               GetDatevQualifioation;
 private String               Spitcial   ;
 private  String              NameSubject  ;
 private DisplayValueModel1   IDschoole     ; 

    public int getIDTeacher() {
        return IDTeacher;
    }

    public void setIDTeacher(int IDTeacher) {
        this.IDTeacher = IDTeacher;
    }

    public String getNameTeacher() {
        return NameTeacher;
    }

    public void setNameTeacher(String NameTeacher) {
        this.NameTeacher = NameTeacher;
    }

    public String getDateEmploee() {
        return DateEmploee;
    }

    public void setDateEmploee(String DateEmploee) {
        this.DateEmploee = DateEmploee;
    }

    public String getQualifioation() {
        return Qualifioation;
    }

    public void setQualifioation(String Qualifioation) {
        this.Qualifioation = Qualifioation;
    }

    public String getGetDatevQualifioation() {
        return GetDatevQualifioation;
    }

    public void setGetDatevQualifioation(String GetDatevQualifioation) {
        this.GetDatevQualifioation = GetDatevQualifioation;
    }

    public String getSpitcial() {
        return Spitcial;
    }

    public void setSpitcial(String Spitcial) {
        this.Spitcial = Spitcial;
    }

    public String getNameSubject() {
        return NameSubject;
    }

    public void setNameSubject(String NameSubject) {
        this.NameSubject = NameSubject;
    }

    public DisplayValueModel1 getIDschoole() {
        return IDschoole;
    }

    public void setIDschoole(DisplayValueModel1 IDschoole) {
        this.IDschoole = IDschoole;
    }
}
