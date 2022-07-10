/**
 * 
 */
package Universite;

/**
 * @author Stagiaire
 *
 */
public class Personnel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Employe gerard;
	gerard = new Employe(1,"Gérard","Blanchard",3);
	System.out.println(gerard);
	
	Etudiant sophie;
	sophie = new Etudiant(2,"Sophie","Blanchard","Brevet");
	System.out.println(sophie);
	
	Professeur bernard;
	bernard = new Professeur(3,"Bernard","Blanchard",2,"Le français");
	System.out.println(bernard);

	}

}
