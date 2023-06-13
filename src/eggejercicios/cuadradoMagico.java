/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

 */
package eggejercicios;
import java.util.Scanner;

public class cuadradoMagico {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];
        
        System.out.println("Ingresa " + 9 + " números" + " y comprobaremos si la matriz es magica");
        
        //Se añaden datos a matriz//
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresa posición " + "[" + i + "]" + "[" + j + "]");
                matriz [i][j] = enter.nextInt();
                
                // Se valida que los números estén entre 1 y 9
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Los números deben estar entre 1 y 9.");
                    return;
                }
            }
        } 
        // Se muestra resultado//
        if (comprobarMatriz(matriz)){
            System.out.println("Es una matriz magica");
        } else {
            System.out.println("No es una matriz magica");
        }
    }
    
    public static boolean comprobarMatriz(int matriz[][]){
        
        int diagonal1 = 0, diagonal2 = 0, sumaC = 0, sumaF = 0;
        
        // Se haya suma de diagonales para comprobar si son iguales//
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i + j == matriz.length -1 ){
                diagonal2 = diagonal2 + matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j==i){
                diagonal1 = diagonal1 + matriz[i][j];
                }
            }
        }

       // Se valida suma de las filas//
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              sumaF = sumaF + matriz[i][j];  
            }
        }
        sumaF = sumaF/3;
        
        // Se valida suma de las columnas//
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              sumaC = sumaC + matriz[j][i];  
            }
        }
        sumaC = sumaC/3;
        
        // Combrobación falso verdadero //
        if(diagonal1 == diagonal2 && diagonal1 == sumaC && diagonal1 == sumaF ){
            return true;    
        }else{
            return false;
        }

    }
}
