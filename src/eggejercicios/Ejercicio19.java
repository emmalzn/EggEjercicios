/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 
 */
package eggejercicios;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la matriz");
        int num = enter.nextInt();
        
        int [][] matriz = new int [num][num];
        
        System.out.println("Ingresa " + num*num + " y comprobaremos si la matriz es anti simetrica");
        
        //Se añaden datos a matriz//
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.println("Ingresa posición " + "[" + i + "]" + "[" + j + "]");
                matriz [i][j] = enter.nextInt();    
            }
        }
        
        mostrar (matriz, num);
        
        if (esMatrizAntisimetrica(matriz, num)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    

    }
public static void mostrar(int matriz [][], int num) {
        
   //Se muestra matriz//
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

}
public static boolean esMatrizAntisimetrica(int matriz [][], int num) {
        //se comprueba si matriz es anti simetrica // 
       int filas = matriz.length;
        int columnas = matriz[0].length;

        if (filas != columnas) {
            return false; // La matriz no es cuadrada
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false; // No se cumple la condición de antisimetría
                }
            }
        }

        return true; // La matriz es antisimétrica 
    }
}


