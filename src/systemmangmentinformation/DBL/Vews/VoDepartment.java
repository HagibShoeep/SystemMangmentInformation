/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Vews;

/**
 *
 * @author shoeep
 */
public class VoDepartment {
 private   int IDDept ;
 private   String  NameDepart;
 private   String      DateStart ;

    public int getIDDept() {
        return IDDept;
    }

    public void setIDDept(int IDDept) {
        this.IDDept = IDDept;
    }

    public String getNameDepart() {
        return NameDepart;
    }

    public void setNameDepart(String NameDepart) {
        this.NameDepart = NameDepart;
    }

    public String getDateStart() {
        return DateStart;
    }

    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }
}
