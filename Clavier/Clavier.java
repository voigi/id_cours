/**
 * 
 */
package Clavier;

import java.util.Scanner;

/**
 * @author voigi
 *
 */
public class Clavier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner nombre = new Scanner(System.in);
		System.out.println("Veuillez tapez un nombre: ");
		int nb = nombre.nextInt();
		System.out.println("Veuillez avez saisi " + nb);
	}

}
