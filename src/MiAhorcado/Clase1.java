
package MiAhorcado;

import java.util.Random;


public class Clase1 {
   

String [] palabra = {"casa","gato","loro"};    
 
 void seleccionarPalabra(){
    String mipalabrita;
    Random miRandom = new Random();
    
    int palabraseleccionada = miRandom.nextInt(2);
    mipalabrita = palabra[palabraseleccionada]; 
   
}
 
}

