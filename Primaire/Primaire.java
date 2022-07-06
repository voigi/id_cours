/**
 * 
 */
package Primaire;

/**
 * @author voigi
 *
 */
public class Primaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creation d'une variable one contenant le 1 puis affichage
		int one = 1;
		System.out.print(one);
		// Creation d'une boucle for allant de 1 à 100
		for (int i = 1; i <= 100; i++) {
			// Creation d'une boucle for à l'interieur de celle-ci
			for (int j = 2; j <= i; j++) {
				// Ici , on met en place nos conditions afin de chercher nos nombres primaires
				// (nombre divisible par 1 et par lui-même)
				if (i % j == 0) {
					if (i == j) {
						// une fois les conditions remplies on affiche les nombres primaires
						System.out.print(" ");
						System.out.print(i);
					} else {
						// puis on arrette la boucle j pour recommencer une iteration
						break;
					}
				}
			}
		}

	}

}
