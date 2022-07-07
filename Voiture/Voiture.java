/**
 * 
 */
package Voiture;

/**
 * @author voigi
 *
 */
public class Voiture {

	/**
	 * @param args
	 */
	String marque;
	String model;
    int poids;
    int places;
    double taille;
    double vitesse;
    
    public  Voiture(){
    }
	
	/**
	 * @param marque
	 * @param model
	 * @param poids
	 * @param places
	 * @param taillle
	 * @param vitesse
	 */
	public Voiture(String marque, String model, int poids, int places, double taille, double vitesse) {
		super();
		this.marque = marque;
		this.model = model;
		this.poids = poids;
		this.places = places;
		this.taille = taille;
		this.vitesse = vitesse;
	}

	  public  String accelerer(int i) {
			return  "Je roule à " + i +"km/h";	
	    }
	  public  String stopper() {
			return  "Je freine";	
	    }
	  public  void afficher() {
		    
		  System.out.println("Caracteristiques:");
		  System.out.println("_________________");
		  System.out.println("");
          System.out.println("Marque: " + this.marque);
          System.out.println("Modele: " + this.model);
          System.out.println("Poids de la voiture: " + this.poids+"kg");
          System.out.println("Nombre de places: " + this.places+"places");
          System.out.println("Taille: " + this.taille);
          System.out.println("vitesse: " + this.vitesse+"km/h");
          System.out.println("");
          System.out.println("*****************");
          
	    }

	public static void main(String[] args) {
		Voiture clio ;
		clio = new Voiture("Renault", "Clio", 35,5,1.250, 10.5);
		System.out.print(clio.marque);
		System.out.print(" ");
		System.out.print(clio.model);
		System.out.println(" ");
		System.out.println(clio.accelerer(15));
		System.out.println(clio.stopper());
		System.out.println(" ");
		clio.afficher();
		
		
		Voiture clio2 ;
		
		clio2 = new Voiture("Renault", "Clio 2", 35,5,1.250, 15.5);
		System.out.print(clio2.marque);
		System.out.print(" ");
		System.out.print(clio2.model);
		System.out.println(" ");
		System.out.println(clio2.accelerer(30));
		System.out.println(clio2.stopper());
		System.out.println(" ");
		clio2.afficher();
	}

}

