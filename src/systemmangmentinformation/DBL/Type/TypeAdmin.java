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
public  enum TypeAdmin {
    
ADMIN(1,"admin") ,MANGER(2,"manger") ,USER(3,"user");
 private    int Id;
 private   String Type;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
  private TypeAdmin(int Id ,String Type){
      this.Id=Id;
      this.Type=Type;
      
  }
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
   public  static TypeAdmin getTypeAdminById(int id){
        for(TypeAdmin typeAdmin:TypeAdmin.values()  ){
            if(typeAdmin.getId()==id){
                return typeAdmin;
            }
        }
        return null;
    }
}
