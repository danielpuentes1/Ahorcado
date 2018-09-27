
package MiAhorcado;

import java.util.Random;


public class Palabra1 {
   

String  palabra[]= {"cqasa","qgato","lqoro","maqgo","pqerro","gatuqbela","ahorqcado","pumqita","queso"};    
 
 
  
    Random miRandom = new Random();
    String mipalabrita(){
    int palabraseleccionada = miRandom.nextInt(9);
    return palabra[palabraseleccionada];  
}
 
}

