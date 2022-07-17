package Bulles;

public class TriBulles {

	public static void main(String[] args) {
		long[] tab = new long[100];

		for (int i = 0; i < 100; i++) {
			tab[i] = Math.round(tab.length * Math.random());
		}

		// faites votre tri à partir d'ici !

		for (int i = 0; i < 99; i++) {

			for (int j = 0; j <99; j++) {
				if (tab[j] > tab[j + 1]) {
					long temp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = temp;
				}

			}

		}

		for (long parcours : tab) {
			System.out.print(" ");
			System.out.print(parcours);
		}
	}
}
