/**
 * 
 */
package Univ;

/**
 * @author Stagiaire
 *
 */
public class Etudiant extends Personne {
	
	private String niveau;

	/**
	 * 
	 */
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void marcher() {
		System.out.println("Je marche");
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Etudiant(int id, String nom, String prenom,String niveau) {
		super(id, nom, prenom);
		this.niveau = niveau;
	}

	/**
	 * @return the niveau
	 */
	public String getNiveau() {
		return niveau;
	}

	/**
	 * @param niveau the niveau to set
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant "  + getId() +": "+"Je m'apelle "+ getPrenom()+ getNom()+" j'ai mon/ma "+ getNiveau();
	}
	
	
	
}
