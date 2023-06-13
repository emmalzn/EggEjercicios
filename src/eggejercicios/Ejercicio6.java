/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un número");
        num = enter.nextInt();
        
        if(num%2 == 0){
            System.out.println("El número ingresado " +  num + " es par");
        } else{
            System.out.println("El número ingresado " +  num + " es impar");
        }
    }
    
}
