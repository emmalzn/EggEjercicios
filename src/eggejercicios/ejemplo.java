/*
 * 
 * 
 */
package eggejercicios;
 import java.util.Random;

public class ejemplo {
    
 
	private static char randomChar() {
		Random entrada = new Random();
		return (char)(entrada.nextInt(26) + 'a');
                
                
	}

	public static void main(String[] args) {
		char letraRandom = randomChar();
		System.out.println(letraRandom);
                
                
                
	}
}
char letraRandom = (char) (random.nextInt(26) + 'a');
        System.out.println(letraRandom);

