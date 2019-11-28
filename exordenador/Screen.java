/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

/**
 * This class uses the constructors and the getters and setters methods 
 * with the * we can obtain characteristics of the screens
 * @author jalonsoriveiro
 * 
 */
public class Screen {
    private String brand;
    private float inches; 
        
    /**
     *
     */
    public Screen(){
}

    /**
     *Metodo constructor
     * @param newBrand screen model
     * @param newInches count inches
     */
    public Screen(String newBrand,float newInches){
    this.brand = newBrand;
    this.inches= newInches;   
}
/**
 * The public String method returns the brand of the Screen.
 * @return  brand
 */
public String getBrand(){
    return brand;    
}
/**
 * descriptions add brand
 * @param brand model that we want to assign to the Screen
 */
public void setBrand(String brand){

    this.brand = brand;
}
/**
 * Descripcion public method that returns us inches
 * @return inches  Returns the current inches
 */
public Float getInches(){
    return inches;

}
/**
 * Metodo public that allows us to give value to inches, the value is passed by parameter
 * @param inches data amount of inches
 */
public void setInches(float inches){
    this.inches = inches;
}
}
