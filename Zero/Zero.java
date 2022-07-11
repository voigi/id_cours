/**
 * 
 */
package Zero;

/**
 * @author Stagiaire
 *
 */
public class Zero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			divise(1, 0);
		} catch (ExceptionPerso e) {
			System.out.println(e.getMessage());
		}
	}

	public static int divise(int a, int b) throws ExceptionPerso {
		if (b == 0) {
			throw new ExceptionPerso("zero la tête à toto !!");
		}

		return a / b;

	}

}
