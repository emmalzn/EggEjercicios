/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
 * números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio10 {
    public static void main(String[] args){
       
        Scanner enter = new Scanner(System.in);
        
        int num, value, suma = 0;
        
        System.out.println("Ingresa un valor positivo");
        num = enter.nextInt();  
        
        do{
            System.out.println("Ingresa un número hasta alcanzar el valor de " + num);
            value = enter.nextInt();  
            suma = suma + value; 
        } while(suma <= num);
        
        System.out.println("La suma de los números ingresados es " + suma);
    }
    
}
