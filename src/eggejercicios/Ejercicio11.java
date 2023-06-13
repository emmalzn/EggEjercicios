/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggejercicios;
import java.util.Scanner;

public class Ejercicio11 {
public static void main(String[] args){
    
        Scanner enter = new Scanner(System.in);
        
        int opc, value, num1 = 0, num2 = 0;
        String letra = "";
        do{
            System.out.println("╔ ═ ═ ═ ═ ═ ═  ═╗");
            System.out.println("║       MENU         ║");
            System.out.println("║     1. Sumar       ║");
            System.out.println("║     2. Restar      ║");
            System.out.println("║     3. Multiplicar ║");
            System.out.println("║     4. Dividir     ║");
            System.out.println("║     5. Salir       ║");
            System.out.println("║     Elija opción:  ║");
            System.out.println("╚ ═ ═ ═ ═ ═ ═  ═╝");
            opc = enter.nextInt(); 
             
         enter.nextLine(); //Es necesario consumir explícitamente ese carácter de nueva línea antes de leer la siguiente línea. 
                           //Puedes hacerlo agregando una llamada a nextLine() después de nextInt() 
                           //para leer y descartar ese carácter de nueva línea.
            if (opc >=1 && opc <= 4){
            System.out.println("Ingrese dos números");
            num1 = enter.nextInt();
            num2 = enter.nextInt();
            }
        
            switch(opc){
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0 ){
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir un número entre 0");
                    } break;
                case 5:
                    System.out.println("¿Esta seguro que quiere salir del programa S/N?");
                    letra = enter.nextLine();
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");   
            } 
        } while(!letra.equalsIgnoreCase("s"));
        
         System.out.println("Hasta luego!");
    }       
}
