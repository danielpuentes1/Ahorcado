
package MiAhorcado;

import java.util.Random;


public class Palabra1 {
   

String  palabra[]= {"cqasaq","qgatoq","lqoroq","maqgoq","pqerrqo","gatuqbelqa","ahorqcadqo","qpumqita","quesoq"};    
 
 
  
    Random miRandom = new Random();
    String mipalabrita(){
    int palabraseleccionada = miRandom.nextInt(9);
    return palabra[palabraseleccionada];  
}
 
}

