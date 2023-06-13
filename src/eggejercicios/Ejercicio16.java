/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
 * usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 */
package eggejercicios;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
      Scanner enter = new Scanner(System.in);  
        
        System.out.println("Ingresa el tamaño del vector");
        int num = enter.nextInt();
        int[] vector = new int[num];
        
        int suma = 0;
        
        System.out.println("Ingrese un número y validaremos si se encuentra en el arreglo");
        int valor = enter.nextInt();
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int)(Math.random()*25+1);
        }
        for (int i = 0; i < num; i++) {
            
            if(num == vector[i]){
                System.out.println("El número ingredaso se encuentra en la posición " + i );
               suma++;
               }
            
        }   
        if(suma == 0){
            System.out.println("El número ingresado no se encuentra en el arreglo");
        }
    }
    
}
