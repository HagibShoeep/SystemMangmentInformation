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
public class VoUpdateRole {
    
    
 private    DisplayValueModel1                IdRole;
 private   DisplayValueModel1 IDTypeUser;
 private   DisplayValueModel1  Department;
 private     String            NmeRole;

    public DisplayValueModel1 getIdRole() {
        return IdRole;
    }

    public void setIdRole(DisplayValueModel1 IdRole) {
        this.IdRole = IdRole;
    }

    public DisplayValueModel1 getIDTypeUser() {
        return IDTypeUser;
    }

    public void setIDTypeUser(DisplayValueModel1 IDTypeUser) {
        this.IDTypeUser = IDTypeUser;
    }

    public DisplayValueModel1 getDepartment() {
        return Department;
    }

    public void setDepartment(DisplayValueModel1 Department) {
        this.Department = Department;
    }

    public String getNmeRole() {
        return NmeRole;
    }

    public void setNmeRole(String NmeRole) {
        this.NmeRole = NmeRole;
    }
}
