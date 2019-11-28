/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

/**
 * This class uses the constructors and the getters and setters methods 
 * with the * we can obtain characteristics of the cpu
 * @author jalonsoriveiro
 */
public class Cpu {
    /**
     * speed initialize variable
     * memory initialize variable
     */
    private int speed;
    private int memory;

public Cpu(){

}    
/**
 * descriptions method Which receives two parameters that give value speed and memory
 * @param speed
 * @param memory 
 */
public Cpu(int speed,int memory){
    this.speed= speed;
    this.memory = memory;
}
/**
 * descriptions method return value speed
 * @return speed
 */
public int getSpeed(){
    return this.speed;
}
/**
 * descriptions method
 * @param speed 
 */
public void setSpeed(int speed){
    this.speed = speed;
}
/**
 * descriptions return value of memory
 * @return memory
 */
public int getMemory(){
    return memory;
}
/**
 * descriptions set new value for memory
 * @param memory new value
 */
public void setMemory(int memory){
    this.memory = memory;
}

}
