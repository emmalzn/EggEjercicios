/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package eggejercicios;
import java.util.Scanner;

public class Extra3 {
    public static void main(String[] args) {
      Scanner enter = new Scanner(System.in);  
       
      String vocal;
      
        System.out.println("Ingresa una vocal");
        vocal = enter.nextLine();
        
        if(vocal.equals("a") || vocal.equals("e") || vocal.equals("i")|| vocal.equals("o") || vocal.equals("u") ){
            System.out.println("Ingresaste la vocal " + vocal);
        } else {
            System.out.println("La letra ingresada no es una vocal ");
        }
    
    }

}
