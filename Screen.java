/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exordenador;

/**
 * Esta clase se usan los <b>contructores</b> y los metodos getters y setters con los 
 * podemos obtener caracteriscas de las pantallas
 * @author jalonsoriveiro
 * 
 */
public class pantalla {
    private String marca;
    private float pulgadas; 
        
    /**
     *
     */
    public pantalla(){


}

    /**
     *
     * @param marca modelo de la pantalla
     * @param pulgadas cantidad de pulgadas
     */
    public pantalla(String marca,float pulgadas){

    this.marca = marca;
    this.pulgadas= pulgadas;
    
}
/**
 * El metodo public String devuelve la marca de la pantalla.
 * @return Devuelve la marca
 */
public String getMarca(){

    return marca;

    
}
/**
 * Descripcion asignar una marca
 * @param marca modelo que queremos asignar a la pantalla
 */
public void setMarca(String marca){

    this.marca = marca;
}
/**
 * Descripcion metodo public que nos devuelve las pulgadas
 * @return pulgadas
 */
public Float getPulgadas(){
    return pulgadas;

}
/**
 * Metodo public que nos permite dar valor a las pulgadas , el valor se pasa por parametro
 * @param pulgadas dato cantidad de pulgasdas 
 */
public void setPulgadas(float pulgadas){
    this.pulgadas = pulgadas;
}
}
