/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

import java.util.Scanner;

/**
 * This class uses the constructors and the getters and setters methods 
 * with the * we can obtain characteristics of the Computer
 * @author jalonsoriveiro
 */
public class Computer {
    
  private Mouse mouse = new Mouse();
  private Screen pantalla = new Screen();
  private Cpu cpu = new Cpu();
    
/**
 **Metodo constructor parameterless
 */
public Computer(){
}
/**
 * constructor method parameterless
 * @param mouse Mouse object and characteristics of the mouse class, is type in the class mouse
 * @param screen screen object and characteristics of the screen class, is newInches and newBrand in the class mouse
 * @param cpu cpu object and characteristics of the cpu class,is speed and memory in the class cpu
 */
public Computer(Mouse mouse,Screen screen,Cpu cpu){

    this.mouse = mouse;
    this.pantalla = screen;
    this.cpu = cpu;    
}
/**
 * descriptions give a new value mouse
 * @param mouse new value for object mouse, is type in the class mouse
 */
public void setMouse(Mouse mouse){
    this.mouse = mouse;
}
/**
 * descriptions method public return value obj mouse 
 * @return Class Mouse
 */
public Mouse getMouse(){

    return mouse;
}
/**
 * descriptions method public return value obj mouse 
 * @param pantalla 
 */
public void setScreen(Screen pantalla){

    this.pantalla = pantalla;
}
/**
 * descriptions method public return value obj mouse 
 * @return 
 */
public Screen getScreen(){

        return this.pantalla;
}
/**
 * descriptions method public return value obj mouse 
 * @return 
 */
public Cpu getCpu(){
    return this.cpu;
}
/**
 * descriptions method public return value obj mouse 
 * @param cpu new value for cpu
 */
public void setCpu(Cpu cpu){

    this.cpu=cpu;
}
/**
 * descriptions method public return value obj mouse 
 * 
 */
public void show(){

System.out.print("Tipo raton "+mouse.getType()+"\nTipo pantalla "+pantalla.getBrand()+"\nPulgadas "+pantalla.getInches()+"\nMemoria"+
        cpu.getMemory()+"\nVelocidad "+cpu.getSpeed());
}
/**
 * descriptions method public return value obj mouse 
 * @return 
 */
public String toShow(){

     System.out.print("Que tipo de raton es ");
        Scanner sc = new Scanner(System.in);        
        String tipo = sc.next();        
        System.out.print("Que marca es la pantalla ");
       //Scanner sc = new Scanner(System.in);        
        String tipoPantalla = sc.next();
        
        System.out.print("Pulgadas");
       //Scanner sc = new Scanner(System.in);        
        float pulgadasPantalla = sc.nextFloat();
        
        System.out.print("cpu velocidad");
       //Scanner sc = new Scanner(System.in);        
        int velocidadCpu= sc.nextInt();
        
         System.out.print("cpu memoria");
       //Scanner sc = new Scanner(System.in);        
        int memoriaCpu= sc.nextInt();
        
        return "Tipo raton:"+tipo+"\n,TipoPantalla:"+tipoPantalla+"\n,Pulgasdas:"+pulgadasPantalla+"\n,Velocidad :"+velocidadCpu+
                "\n,Memoria:"+memoriaCpu+",";

}

}