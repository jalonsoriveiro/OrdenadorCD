/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

/**
 * This class uses the constructors and the getters and setters methods 
 * with the * we can obtain characteristics of the mouse
 * @author jalonsoriveiro
 */
public class Mouse {
    
    private String type;
  /**
   * constructor method parameterless
   */  
public Mouse(){
}    
     /**
     * descriptions Metodo constructor
     * @param type type of mouse
     */
public Mouse(String type){
    this.type=type;
}
/**
 * descriptions public method that returns type of mouse
 * @return  type of mouse
 */
public String getType(){        
        return type;
}
/**
 * descriptions public method that set type of mouse
 * @param type new value for type of mouse
 */
public void setType(String type){    
 this.type = type;       
        
}
}