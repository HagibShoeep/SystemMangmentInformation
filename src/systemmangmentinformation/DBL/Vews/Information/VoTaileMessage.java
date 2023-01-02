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
public class VoTaileMessage {
private int                  IDMessage;
private DisplayValueModel1   IDVilageTo;
private DisplayValueModel1   IDSchoolTo;
private DisplayValueModel1   IDteacher;
private String               nameSubjectNew;

    public int getIDMessage() {
        return IDMessage;
    }

    public void setIDMessage(int IDMessage) {
        this.IDMessage = IDMessage;
    }

    public DisplayValueModel1 getIDVilageTo() {
        return IDVilageTo;
    }

    public void setIDVilageTo(DisplayValueModel1 IDVilageTo) {
        this.IDVilageTo = IDVilageTo;
    }

    public DisplayValueModel1 getIDSchoolTo() {
        return IDSchoolTo;
    }

    public void setIDSchoolTo(DisplayValueModel1 IDSchoolTo) {
        this.IDSchoolTo = IDSchoolTo;
    }

    public DisplayValueModel1 getIDteacher() {
        return IDteacher;
    }

    public void setIDteacher(DisplayValueModel1 IDteacher) {
        this.IDteacher = IDteacher;
    }

    public String getNameSubjectNew() {
        return nameSubjectNew;
    }

    public void setNameSubjectNew(String nameSubjectNew) {
        this.nameSubjectNew = nameSubjectNew;
    }

}
