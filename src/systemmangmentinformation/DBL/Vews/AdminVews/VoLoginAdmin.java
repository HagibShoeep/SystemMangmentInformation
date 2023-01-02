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
public class VoLoginAdmin {
    
private        int        IDUser;
private      String       NameUser;
private DisplayValueModel1 IDAdmin;

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
          
private       String      Password;
}
