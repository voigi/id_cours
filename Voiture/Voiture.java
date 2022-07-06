 /**
 * 
 */
package Voiture;

/**
 * @author Voigi
 *
 */
public class Voiture {

    /**
     * @param args
     */
	//Attributs de l'objet
    String marque;
    String model;
    int poids;
    int places;
    double taille;
    double vitesse;
    
    //Constructeur vide (parent)
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
    //Constructeur avec les attributs de l'objet
    public Voiture(String marque, String model, int poids, int places, double taille, double vitesse) {
        super();
        this.marque = marque;
        this.model = model;
        this.poids = poids;
        this.places = places;
        this.taille = taille;
        this.vitesse = vitesse;
    }
      //Methodes de l'objet
      public  String accelerer(int i) {
            return  "Je roule à " + i +"km/h";    
        }
      public  String stopper() {
            return  "Je freine";    
        }
      // affichage des caracteristiques de l'objet
      public  void afficher() {
            System.out.println("Caracteristiques:");
            System.out.println("Marque: " + this.marque);
            System.out.println("Modele: " + this.model);
            System.out.println("Poids de la voiture: " + this.poids+"kg");
            System.out.println("Nombre de places: " + this.places+"places");
            System.out.println("Taille: " + this.taille);
            System.out.println("vitesse: " + this.vitesse+"km/h");
        }
     // Voiture 1
    public static void main(String[] args) {
        Voiture clio ;
        clio = new Voiture("Renault", "Clio",1240,5,1.250, 30);
        System.out.print(clio.marque);
        System.out.print(" ");
        System.out.print(clio.model);
        System.out.println(" ");
        System.out.println(clio.accelerer(15));
        System.out.println(clio.stopper());
        System.out.println(" ");
        clio.afficher();
        System.out.println(" ");
        
        //Voiture2
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
        System.out.println(" ");
    }

}
