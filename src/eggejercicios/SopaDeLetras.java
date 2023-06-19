/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package eggejercicios;

import java.util.Scanner;

public class SopaDeLetras {

    public static void main(String[] args) {
        char[][] sopaDeLetras = new char[20][20];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 palabras de mínimo 3 y máximo 5 caracteres:");
        String[] palabras = new String[5];

        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = scanner.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres. Ingrese nuevamente:");
                palabras[i] = scanner.nextLine();
            }
        }

        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int filaAleatoria = (int) (Math.random() * 20);
            int columnaInicial = (int) (Math.random() * (21 - palabra.length()));
            System.out.println(filaAleatoria);
            System.out.println(columnaInicial);
            
            for (int j = 0; j < palabra.length(); j++) {
                sopaDeLetras[filaAleatoria][columnaInicial] = palabra.substring(j, j + 1).charAt(0);
                columnaInicial ++; 
            }
            
        }

        // Rellenar los espacios no utilizados con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaDeLetras[i][j] == 0) {
                    sopaDeLetras[i][j] = (char) (Math.random() * 26 + 'a');
                }
            }
        }

        // Imprimir la sopa de letras
        System.out.println("Sopa de Letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }

    }

}
