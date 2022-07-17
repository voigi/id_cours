/**
 * 
 */
package Personne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Stagiaire
 *
 */
public class MainPersonne {

	/**
	 * @param args
	 *
	 */
	public static void main(String[] args) {

		Scanner choix = new Scanner(System.in);
		menu();
		String input = choix.nextLine();

		List<Personne> liste = new ArrayList<>();
		// int count=0;
		while (!"5".equals(input)) { // tant qu'on ne quitte pas le programme on reste dans le switch

			switch (input) {
			case "1":
				if (liste.isEmpty()) {
					System.out.println("La liste est vide,veuillez d'abord ajouter une personne"); // on verifie si la
																									// liste est vide

				} else {
					for (Personne personn : liste) { // sinon on parcourt la liste

						// System.out.print(count);
						// System.out.print(" ");
						System.out.println(personn);

					}
				}
				break;
			case "2":
				// on creer une instance d'objet personne avec les entrées données par
				// l'utilisateur
				Personne personne = null;
				System.out.println("Veuillez entrez votre nom?");
				String ajout = choix.nextLine();
				personne = new Personne();
				personne.setNom(ajout);
				System.out.println("Veuillez entrez votre prenom?");
				String ajout2 = choix.nextLine();
				personne.setPrenom(ajout2);
				System.out.println("Veuillez entrez votre age?");
				String ajout3 = choix.nextLine();
				personne.setAge(ajout3);
				liste.add(personne);
				System.out.println("La personne a été ajoutée à la liste");
				break;

			case "3":

				if (liste.isEmpty()) {
					System.out.println("La liste est vide,veuillez d'abord ajouter une personne");
				} else {
					for (Personne personn : liste) {
						System.out.println(personn);

					} // on demande à l'utilisateur quel donnée de la liste il veut supprimer
					System.out.println("Quel personne voulez vous retirer ?");
					try {
						String suppr = choix.nextLine();
						liste.remove(Integer.parseInt(suppr));
						System.out.println("La personne a été supprimée de la liste");
					} catch (Exception e) {//gestion de l'exception out of bounds avec un try catch
						System.out.println("Cette personne n'existe pas");

					}

				}
				break;
			case "4":
				if (liste.isEmpty()) {
					System.out.println("La liste est vide,veuillez d'abord ajouter une personne");
					break;
				} else {

					System.out.println("Quel personne voulez vous modifier ?");

					for (Personne personn : liste) {
						System.out.println(personn);
					} // on demande à l'utilisateur quel donnée de la liste il veut modifier apres
						// selection de l'element
					String modify = choix.nextLine();
					Personne person = null;
					System.out.println("Veuillez entrez le nouveau nom?");
					String modif = choix.nextLine();
					person = new Personne();
					person.setNom(modif);
					System.out.println("Veuillez entrez le nouveau prenom?");
					String modify2 = choix.nextLine();
					person.setPrenom(modify2);
					System.out.println("Veuillez entrez le nouvel age?");
					String modify3 = choix.nextLine();
					person.setAge(modify3);
					try {
						liste.set((Integer.parseInt(modify)), person);
						System.out.println("La personne a été modifiée de la liste");
					} catch (Exception e) {//gestion de l'exception out of bounds avec un try catch
						System.out.println("Cette personne n'existe pas");
						
					}
					break;
				}
			default:// si le choix de l'utilisateur n'est pas dans le menu , on lui indique de faire
					// un autre choix
				System.out.println("Veuillez faire un autre choix !!!");
				System.out.println(" ");

			}
			// retour menu
			menu();
			input = choix.nextLine();

		}
		// bye bye
		System.out.println("au revoir");

	}

	public static void menu() {
		// methode qui lance le menu
		System.out.println(" ");
		System.out.println("Quel est votre choix ?");
		System.out.println("1->Afficher la liste");
		System.out.println("2->Ajouter à la liste");
		System.out.println("3->Retirer une Personne");
		System.out.println("4->Modifier une Personne");
		System.out.println("5->Quitter le Programme");

	}

}
