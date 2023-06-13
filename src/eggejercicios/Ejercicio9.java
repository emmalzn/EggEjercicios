/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
 * diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
 * la función Substring y equals() de Java.
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio9 {
    public static void main(String[] args) {
       
        Scanner enter = new Scanner(System.in);
        
        String frase, vowel;
        
        System.out.println("Ingresa una palabra o frase");
        frase = enter.nextLine();
        
        vowel = frase.substring(0,0);
        
        if(vowel.equals("A")){
            System.out.println("Incorrecto");
        } else{
            System.out.println("Correcto");
        }
    }
}
