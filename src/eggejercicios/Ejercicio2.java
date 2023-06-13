/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 * pantalla.
 */
package eggejercicios;

import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        
        String name;
        
        System.out.println("Ingresa tu nombre:");
        name = enter.nextLine();
        
        System.out.println("Hola " + name + " un gusto conocerte");
        
       
    }      
            
}
