/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemmangmentinformation.Validition;

import java.text.DateFormat;
import javafx.scene.chart.PieChart;

/**
 *
 * @author shoeep
 */
public class Validation {
    
    public static boolean isEmptyVal(String... text){
        
        for(String ame:text  ){
            if(ame.isEmpty()){
                return true;
            }
           
        }
        
        return false;
        
    }
    
  public static boolean isEmptyVal1(int... values){
        
       for(int i :values  ){
          if(i<=0){
               return true;
           }
           
        }
        
       return false;
        
    }  
  
    public static boolean isDigeit(String... values){
        
     for(String match :values  ){ 
            if(match.matches("[0-9]+")){ 
                return false;
            }
           
        }
        
        return true;
        
    }  
   public static boolean isText(String... text){
        
        for(String match :text  ){
            if(!match.matches("[a-z]+[1-9]+"));{ 
                return false;
            }
           
        }
        
        return true;
        
    }  
   
   public static  boolean  isDateCorect(DateFormat  star ,DateFormat end){
       if(star.hashCode()>end.hashCode())
       {
           return false;
       }
       return true;
   }
}
