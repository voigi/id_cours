package Personne;

public class Personne {

	private String nom;
	private String prenom;
	private String age;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	Personne(String nom, String prenom, String age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAge() {
		return age;

	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " Personne  [ nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}