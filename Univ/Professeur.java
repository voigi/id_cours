/**
 * 
 */
package Univ;

/**
 * @author Stagiaire
 *
 */
public class Professeur extends Employe {
	private String matiere;

	/**
	 * 
	 */
	public Professeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param Salaire
	 */
	public Professeur(int id, String nom, String prenom, int Salaire,String matiere) {
		super(id, nom, prenom, Salaire);
		this.matiere = matiere;
	}

	/**
	 * @return the matiere
	 */
	public String getMatiere() {
		return matiere;
	}

	/**
	 * @param matiere the matiere to set
	 */
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return  "Employe "  + getId() +": "+"Je m'apelle "+ getPrenom()+ getNom()+" je suis payé "+ getSalaire()+" euros"+" et j'enseigne "+ getMatiere();
	}

}
