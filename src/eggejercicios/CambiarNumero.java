/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */
package eggejercicios;


public class CambiarNumero {
    public static void main(String[] args) {
        String numCadena;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String cadena = i + "-" + j + "-" + k;
                    cadena = cadena.replace("3", "E");
                    System.out.println(cadena);

                }
                
            }
  
        }
    }

}
