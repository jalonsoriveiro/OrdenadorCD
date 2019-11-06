/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

/**
 *
 * @author jalonsoriveiro
 */
public class Cpu {
    
    private int speed;
    private int memory;

public Cpu(){

}    
public Cpu(int velocidade,int memoria){
    this.speed= velocidade;
    this.memory = memoria;
}
public int getSpeed(){
    return this.speed;
}
public void setSpeed(int velocidade){
    this.speed = velocidade;
}
public int getMemory(){
    return memory;
}
public void setMemory(int memoria){
    this.memory = memoria;
}

}
