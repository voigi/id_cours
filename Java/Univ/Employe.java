/**
 * 
 */
package Univ;

/**
 * @author Stagiaire
 *
 */
public class Employe extends Personne {
	
	private int Salaire ;

	/**
	 * 
	 */
	public Employe() {
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
	public Employe(int id, String nom, String prenom,int Salaire) {
		super(id, nom, prenom);
		this.Salaire = Salaire;
	}

	/**
	 * @return the salaire
	 */
	public int getSalaire() {
		return Salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(int salaire) {
		Salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe "  + getId() +": "+"Je m'apelle "+ getPrenom()+ getNom()+" je suis payé "+ getSalaire()+" euros";
	}
	
	

}
