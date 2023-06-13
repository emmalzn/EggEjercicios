/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
 * Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        
        double temp;
        double result;
        
        System.out.println("Ingresa la temperatura en grados centrigrados ");
        temp = enter.nextDouble();
        
        result = 32 + (9 * temp/5); // Formula Fahrenheit
        
        System.out.println("Ingraste " + temp + " grados centrigrados esto equivale a " + result + " grados Fahrenheit");
    }
    
}

