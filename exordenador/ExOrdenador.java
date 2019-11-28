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
public class ExOrdenador {

    /**
     * Main Method, We create the objects and assign / visualize values.
     * @param args the command line arguments 
     */
    public static void main(String[] args) {

        // TODO code application logic here
        /*  System.out.print("Que tipo de raton es ");
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
        //rato rato1 = new rato("inal");
        rato rato1 = new rato(tipo);
        pantalla pantalla1 = new pantalla(tipoPantalla,pulgadasPantalla);
        cpu cpu1 = new cpu(velocidadCpu,memoriaCpu);
        
        ordenador ord1 = new ordenador(rato1,pantalla1,cpu1);
        ord1.show();                              
        /**/
        //prueba
        /* ordenador ord2 = new ordenador();
    String x=ord2.amosar1();
    
    System.out.print(x);
   
    String cutString = x.substring(14, 18);
    System.out.print("\n TipoPantalla "+cutString);
    
     String cutString2 = x.substring(28,32);
    System.out.print("\nPulgasdas "+cutString2);
    
     String cutString3 = x.substring(43,46);
    System.out.print("\nVelocidad "+cutString3);
    
     String cutString4 = x.substring(55,57);
    System.out.print("\nMemoria "+cutString4);*/
        Computer ord2 = new Computer();
        String x = ord2.toShow();

        String firstPosition = new String(x);
        int index = firstPosition.indexOf(':');
        index += 1;
        int y = firstPosition.indexOf(',', index);
        //    System.out.print(index);
        //  System.out.print("->"+y+"<-");

        String cutString = x.substring(index, y);
        System.out.print("Tipo raton " + cutString);

        index = y + 1;
        int countScreen = firstPosition.indexOf(':', index);
        int countScreenComa = firstPosition.indexOf(',', index);
        String cutString1 = x.substring(countScreen, countScreenComa);
        System.out.print("TipoPantalla " + cutString1);

        index = countScreenComa + 1;
        int countInches = firstPosition.indexOf(':', index);
        int countInchesComa = firstPosition.indexOf(',', index);
        String cutString2 = x.substring(countInches, countInchesComa);
        System.out.print("Pulgasdas " + cutString2);

        index = countInchesComa + 1;
        int countSpeed = firstPosition.indexOf(':', index);
        int countSpeedComa = firstPosition.indexOf(',', index);
        String cutString3 = x.substring(countSpeed, countSpeedComa);
        System.out.print("Velocidad " + cutString3);

        index = countSpeedComa + 1;
        int countMemory = firstPosition.indexOf(':', index);
        int countMemoryComa = firstPosition.indexOf(',', index);
        String cutString4 = x.substring(countMemory, countMemoryComa);
        System.out.print("Memoria " + cutString4);

    }

}
