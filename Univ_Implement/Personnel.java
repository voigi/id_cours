/**
 * 
 */
package Univ_Implement;

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
	gerard = new Employe();
	System.out.println(gerard.courir());
	
	Etudiant sophie;
	sophie = new Etudiant();
	System.out.println(sophie.marcher());
	
	Professeur bernard;
	bernard = new Professeur();
	System.out.println(bernard.courir());

	}

}