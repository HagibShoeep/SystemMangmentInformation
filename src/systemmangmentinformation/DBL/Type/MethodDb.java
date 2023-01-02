/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.DBL.Type;

import java.util.List;

/**
 *
 * @author shoeep
 */
public interface MethodDb<T> {
    
         public   List<T>  getAllElement()throws Exception;
         public  int  insert(T t )throws  Exception; 
         public  int      update(T t)throws  Exception; 
         public  int  delete(T t)throws  Exception; 
         public  T  search(T t)throws  Exception; 
    public List<DisplayValueModel1> getFkFromTable()throws  Exception;
                        
}
