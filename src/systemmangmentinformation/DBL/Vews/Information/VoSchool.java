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
public class VoSchool {
    
 private int                 IDSchool ;
 private DisplayValueModel1  IDvilage;
 private String              NameSchool;

    public int getIDSchool() {
        return IDSchool;
    }

    public void setIDSchool(int IDSchool) {
        this.IDSchool = IDSchool;
    }

    public DisplayValueModel1 getIDvilage() {
        return IDvilage;
    }

    public void setIDvilage(DisplayValueModel1 IDvilage) {
        this.IDvilage = IDvilage;
    }

    public String getNameSchool() {
        return NameSchool;
    }

    public void setNameSchool(String NameSchool) {
        this.NameSchool = NameSchool;
    }
    
}
