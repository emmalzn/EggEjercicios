/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
 * la función equals() en Java.
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingresa una frase");
        frase = enter.nextLine();
        
        if( frase.equals("eureka") == true) {
            System.out.println("Correcto!"); 
        } else {
            System.out.println("Incorrecto");  
        }
        
    }
}
