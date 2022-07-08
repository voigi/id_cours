/**
 * 
 */
package carette;

/**
 * @author voigi
 *
 */
public class Voiture {
	String marque;
	String model;
    	String couleur;
    
    public Voiture(String marque,String model,String couleur )
    
    {
    	
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
	}
    public String accelerer() {
		return  "Je roule à fond la caisse";	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Voiture clio ;
		clio = new Voiture("Renault", "Clio", "Bleu");
		System.out.print(clio.marque);
		System.out.print(" ");
		System.out.print(clio.model);
		System.out.print(" ");
		System.out.print(clio.couleur);
		System.out.print(" ");
		System.out.println(clio.accelerer());
		
		
		Voiture clio2 ;
		clio2 = new Voiture("Renault", "Clio", "Rouge");
		System.out.print(clio2.marque);
		System.out.print(" ");
		System.out.print(clio2.model);
		System.out.print(" ");
		System.out.print(clio2.couleur);
	}

}
