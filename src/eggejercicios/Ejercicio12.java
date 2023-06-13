/*
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
 * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
 * fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
 * X y el último tiene que ser una O.
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio12 {
    public static void main(String[] args) {
      Scanner enter = new Scanner(System.in);
      
      String code, varX, varO;
      int right = 0, wrong = 0;
      
      do{
          System.out.println("Ingresa la cadena de codigo Rs232 para salir ingresa &&&&&");
          code = enter.nextLine();
          varX = code.substring(0,1);
          varO = code.substring(4,5);
          if(code.length() == 5 && varX.equalsIgnoreCase("X") && varO.equalsIgnoreCase("O")){
              System.out.println("Correcto");
              right = right + 1;
          } else if(code.equalsIgnoreCase("&&&&&")){
              System.out.println("Fin de envios");
          } else {
              System.out.println("Incorrecto");
              wrong = wrong + 1;
          }

      } while(!code.equalsIgnoreCase("&&&&&"));
      
        System.out.println("Total de lectutas correctas es " + right);
        System.out.println("Total de lectutas incorrectas es " + wrong);
      
    }
}
