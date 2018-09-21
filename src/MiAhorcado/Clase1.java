/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiAhorcado;

import java.util.Random;


public class Clase1 {
   

String [] palabra = {"casa","gato","loro"};    
 
 void seleccionarPalabra(){
    lapalabrita mi1 = new lapalabrita();
    Random miRandom = new Random();
    
    int palabraseleccionada = miRandom.nextInt(2);
    mi1.laq = palabra[palabraseleccionada]; 
   
}
 
}

