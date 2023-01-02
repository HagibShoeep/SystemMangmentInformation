/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Vews.Information;

/**
 *
 * @author shoeep
 */
public class VoBranch {

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

  
   private int count;
    private int   IDBranch;
   private String NameBranch;

    public int getIDBranch() {
        return IDBranch;
    }

    public void setIDBranch(int IDBranch) {
        this.IDBranch = IDBranch;
    }

    public String getNameBranch() {
        return NameBranch;
    }

    public void setNameBranch(String NameBranch) {
        this.NameBranch = NameBranch;
    }
    
    
    
}
