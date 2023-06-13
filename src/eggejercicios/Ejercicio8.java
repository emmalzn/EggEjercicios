/*
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
 *usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
 *pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 *Nota: investigar la función .length() en Java.
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio8 {
    public static void main(String[] args) {
       
        Scanner enter = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingresa una palabra o frase de 8 letras");
        frase = enter.nextLine();
        
        
        if(frase.length() == 8){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
}
