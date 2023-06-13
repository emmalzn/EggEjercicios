/*
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
 *en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package eggejercicios;

import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
    
    Scanner enter = new Scanner(System.in);
    
    String frase;
    
        System.out.println("Ingrese una frese");
        frase = enter.nextLine();
        
        System.out.println(frase.toUpperCase());
        
        System.out.println(frase.toLowerCase());
    
}
}
