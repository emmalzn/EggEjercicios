/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package eggejercicios;
import java.util.Scanner;
/**
 *
 * @author emmal
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        
        String divisa;
        int cantidad;
        
        System.out.println("Ingrese la cantidad de euros que desea convertir");
        cantidad = enter.nextInt();
        
        enter.nextLine();
        
        System.out.println("Seleccione moneda a convertir: yenes, dólares o libras ");
        divisa = enter.nextLine();
        
        convertirMoneda( divisa, cantidad);
    }
    
public static void convertirMoneda(String divisa, int cantidad) {
        double tasa[] = {150.23,1.7,0.87};
        
        
        if(divisa.equalsIgnoreCase("yenes")){
                System.out.println("Ingresaste €" + cantidad + " euros equivalen a ¥" + (tasa[0] * cantidad) + " yenes");
        }else if (divisa.equalsIgnoreCase("dolares")){
                System.out.println("Ingresaste €" + cantidad + " euros equivalen a $" + (tasa[1] * cantidad) + " dólares");
        }else if (divisa.equalsIgnoreCase("libras")){
                System.out.println("Ingresaste €" + cantidad + " euros equivalen a £" + (tasa[2] * cantidad) + " libras");
   
        }
    }        
}

