package eggejercicios;
/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
*/
import java.util.Random;
public class Ejercicio18 {
    public static void main(String[] args) {
        Random ale = new Random();
        
        int [][] matriz = new int[4][4];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
            matriz[i][j] = ale.nextInt(99 - 10 +1)+10;
            }
        }
        System.out.println("Matriz original");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++){
                System.out.print( matriz[i][j]  + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("Matriz transpuesta");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                System.out.print( matriz[j][i]  + " ");
            }
            System.out.println(" ");
        }
    }

}
