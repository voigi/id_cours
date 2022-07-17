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
	      String couleur;
	      boolean moteurDemarre = false;
	      int vitesse;
    
    public  Voiture(){
	    super();
    }
	
	/**
	 * @param marque
	 * @param model
	 * @param couleur
	 * @param vitesse
	 */
	public Voiture(String marque, String model, String couleur, int vitesse) {
		super();
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.moteurDemarre = false;
		this.vitesse = 0;
	}

          public void demarrer() {
		this.moteurDemarre = true;
	}
	  public  int accelerer(int vitesseEnplus) {
			if (this.moteurDemarre) {
			this.vitesse += vitesseEnplus;
		}
		
		return this.vitesse;
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
		 System.out.println("couleur : " + this.couleur);
		 System.out.println("en marche : " + this.moteurDemarre);
		 System.out.println("vitesse: " + this.vitesse+"km/h");
		 System.out.println("");
		 System.out.println("*****************");
          
	    }

	public static void main(String[] args) {
		Voiture clio ;
		clio = new Voiture("Renault", "Clio", "bleu",10);
		clio.demarrer();
		System.out.print(clio.marque);
		System.out.print(" ");
		System.out.print(clio.model);
		System.out.println(" ");
		System.out.println(clio.accelerer(15));
		System.out.println(clio.stopper());
		System.out.println(" ");
		clio.afficher();
		
		
		Voiture clio2 ;
		
		clio2 = new Voiture("Renault", "Clio 2", "Rouge",5);
		clio2.demarrer();
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
