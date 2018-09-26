
package MiAhorcado;

import java.util.Random;


public class Clase1 {
   

String  palabra[]= {"casa","gato","loro","mago","perro","gatubela","ahorcado","pumita"};    
 
 
  
    Random miRandom = new Random();
    String mipalabrita(){
    int palabraseleccionada = miRandom.nextInt(3);
    return palabra[palabraseleccionada]; 
    
    
   
}
 
}

