/**
 * 
 */
package Impair;

/**
 * @author voigi
 *
 */
public class Impair {

	/**
	 * @param args
	 */
	
	/* ici on utilise une boucle for pour boucler ,
	puis on utilise les modulos pour trouver
	les nombres impaires divisible par 3*/
	
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1 && i % 3 == 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}

	}

}
