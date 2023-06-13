/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
 */
package eggejercicios;
import java.util.Scanner;

public class DivisionConRestas {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        int dividendo;
        int divisor;
        
        // Confirmar que el dividendo sea diferente a 0 y mayor que el divisor
       do{
           System.out.println ("Ingrese el dividendo");
           dividendo = enter.nextInt();
           
           System.out.println ("Ingrese el divisor");
           divisor = enter.nextInt();
           
           if(dividendo < divisor){
               System.out.println("El divisor debe ser maypor que el dividendo");
           }else if(dividendo == 0){
           System.out.println("el dividendo no puede ser 0");
           }
       
       }while(dividendo < divisor || dividendo == 0 );
       
       ResultadoDivision(dividendo, divisor);
    }
    public static void ResultadoDivision(int dividendo, int divisor) {
        
        int contador = 0;
        // Se calcula el cociente y el residuo usando restas
        while (dividendo > divisor){
          dividendo = dividendo - divisor;
          contador++;
        }
        System.out.println("El residuo es " + dividendo + " y el cociente es " + contador);
    }
}
