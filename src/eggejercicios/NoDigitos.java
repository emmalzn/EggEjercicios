/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. 
 */
package eggejercicios;
import java.util.Scanner;

public class NoDigitos {
    public static void main(String[] args) {
         Scanner enter = new Scanner(System.in);
         
         int num;
         
         System.out.println("Ingresa un número y te diremos cuantos digitos tiene");
         num = enter.nextInt();
         
         System.out.println(num + " tiene " + Resultado(num) + " digitos");
         
      
    }
public static int Resultado(int num) {
        
        int contador = 0;
        // Se calcula el cociente y el residuo usando restas
        while (num > 0){
          num = num/10;
          contador++;
        }

        return contador;
    }
}
