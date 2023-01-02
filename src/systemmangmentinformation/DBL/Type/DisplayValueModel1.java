/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Type;

/**
 *
 * @author shoeep
 */
public class DisplayValueModel1 {

    public Object getDisplayMemeber() {
        return DisplayMemeber;
    }

    public void setDisplayMemeber(Object DisplayMemeber) {
        this.DisplayMemeber = DisplayMemeber;
    }

    public Object getValueMember() {
        return valueMember;
    }

    public void setValueMember(Object valueMember) {
        this.valueMember = valueMember;
    }
    
    public Object DisplayMemeber;
    public Object  valueMember;

   public   DisplayValueModel1(Object valueMember,Object DisplayMemeber){

   this.valueMember=valueMember;
        this.DisplayMemeber=DisplayMemeber;  
       
       
   }

   

    @Override
    public String toString() {
        return DisplayMemeber.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
