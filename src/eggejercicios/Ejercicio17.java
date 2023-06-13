/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package eggejercicios;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);  
        
        System.out.println("Ingresa el tamaño del vector");
        int num = enter.nextInt();
        int[] vector = new int[num];
        int valor = 1, suma = 0;
         
        
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un valor entre 1 y 5 digitos");
            vector[i] = enter.nextInt();
          
        }
        for (int i = 0; i < num; i++) {
            
            valor = vector[i];
            while (valor != 0) {  
                  valor = valor/10;
                   suma++;
            }
           
            System.out.println("El número ingresado " + vector[i] + " tiene " + suma + " digito(s)");
            suma = 0;
           
        }
        
    }

}
