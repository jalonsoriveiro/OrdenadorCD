/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Computer {
    
  private Rato rato = new Rato();
  private Screen pantalla = new Screen();
  private Cpu cpu = new Cpu();
    

public Computer(){
}
public Computer(Rato rato,Screen pantalla,Cpu cpu){

    this.rato = rato;
    this.pantalla = pantalla;
    this.cpu = cpu;    
}

public void setRato(Rato rato){
    this.rato = rato;
}
public Rato getRato(){

    return rato;
}
public void setPantalla(Screen pantalla){

    this.pantalla = pantalla;
}
public Screen getPantalla(){

        return this.pantalla;
}

public Cpu getCpu(){
    return this.cpu;
}
public void setCpu(Cpu cpu){

    this.cpu=cpu;
}

public void amosar(){

System.out.print("Tipo raton "+rato.getTipo()+"\nTipo pantalla "+pantalla.getBrand()+"\nPulgadas "+pantalla.getInches()+"\nMemoria"+
        cpu.getMemory()+"\nVelocidad "+cpu.getSpeed());
}

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