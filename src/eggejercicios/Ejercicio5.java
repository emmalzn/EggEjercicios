/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingresa un número");
        num = enter.nextInt();
        
        System.out.println(" Ingresaste el número " + num + " el doble es " + num * 2 + " el triple es " + num * 3 + " la raiz cuafrada es " + Math.sqrt(num));
    }
}
