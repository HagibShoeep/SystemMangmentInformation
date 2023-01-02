/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Vews.MangmentUsers;

import systemmangmentinformation.DBL.Type.DisplayValueModel1;

/**
 *
 * @author shoeep
 */
public class VoUsersMangment {

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public String getNameUser() {
        return NameUser;
    }

    public void setNameUser(String NameUser) {
        this.NameUser = NameUser;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public DisplayValueModel1 getIDEmp() {
        return IDEmp;
    }

    public void setIDEmp(DisplayValueModel1 IDEmp) {
        this.IDEmp = IDEmp;
    }

    public DisplayValueModel1 getTypeID() {
        return typeID;
    }

    public void setTypeID(DisplayValueModel1 typeID) {
        this.typeID = typeID;
    }
  private int IDUser;
private    String NameUser;
  private   String Password;
private DisplayValueModel1 IDEmp;
private  DisplayValueModel1 typeID;

  
    
}
