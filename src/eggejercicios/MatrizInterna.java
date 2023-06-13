/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P. 
 */
package eggejercicios;

public class MatrizInterna {
   public static void main(String[] args) {
        int[][] matrizM = {
            {36, 25, 14, 13, 34, 29, 67, 91, 70, 75},
            {71, 40, 2, 11, 80, 25, 27, 9, 85, 96},
            {57, 7, 83, 30, 5, 31, 88, 63, 4, 87},
            {56, 15, 98, 31, 67, 99, 78, 26, 97, 70},
            {82, 46, 20, 34, 87, 50, 27, 18, 78, 10},
            {28, 73, 65, 42, 40, 96, 49, 70, 88, 18},
            {86, 10, 44, 23, 50, 58, 72, 0, 0, 3},
            {3, 61, 11, 38, 39, 15, 23, 5, 16, 17},
            {75, 72, 61, 58, 97, 61, 88, 6, 17, 9},
            {43, 15, 65, 27, 31, 39, 86, 74, 66, 23}
        };

        int[][] matrizP = {
            {87, 50, 27},
            {40, 96, 49},
            {50, 58, 72}
        };

        int filasM = matrizM.length;
        int columnasM = matrizM[0].length;
        int filasP = matrizP.length;
        int columnasP = matrizP[0].length;

        for (int i = 0; i <= filasM - filasP; i++) {
            for (int j = 0; j <= columnasM - columnasP; j++) {
                boolean submatrizCoincide = true;
                for (int k = 0; k < filasP; k++) {
                    for (int l = 0; l < columnasP; l++) {
                        if (matrizM[i + k][j + l] != matrizP[k][l]) {
                            submatrizCoincide = false;
                            break;
                        }
                    }
                    if (!submatrizCoincide) {
                        break;
                    }
                }
                if (submatrizCoincide) {
                    System.out.println("La submatriz P está contenida en la matriz M.");
                    System.out.println("Fila: " + i + ", Columna: " + j);
                    return;
                }
            }
        }
        System.out.println("La submatriz P no está contenida en la matriz M.");
    }
}
