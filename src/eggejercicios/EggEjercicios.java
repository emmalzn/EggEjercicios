/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 */
package eggejercicios;

import java.util.Scanner;

/**
 *
 * @author emmal
 */
public class EggEjercicios {



    public static void main(String[] args) {
        
        Scanner enter = new Scanner (System.in);
        
        int num;
        int num2;
        int suma;
        
        System.out.println("Ingrese un número");
        num = enter.nextInt();
        
        System.out.println("Ingrese un segundo número");
        num2 = enter.nextInt();
        
        suma = num2 + num;
        
        System.out.println("La suma de " + num + " + " + num2 + " es " + suma);
        
    }
    
}
