package Biblioteka25;

// Fajl Test.java

public class Test {
	public static void main(String[] args) {
		Knjiga k1 = new Knjiga("Prokleta avlija", "Ivo Andrić", 1954, 240, 6.50, "roman");
		Knjiga k2 = new Knjiga("Mali princ", "Antoan de Sent Egziperi", 1943, 96, 8.99, "bajka");
		Knjiga k3 = new Knjiga("Gorski vijenac", "Petar II Petrović Njegoš", 1847, 512, 12.75, "poezija");

		// Pozivi za k2
		System.out.println(k2.opis());
		System.out.printf("Cijena sa dodacima: %.2f€\n", k2.cijenaSaDodacima());
		
		// Test za g)
        int[] niz = {123, -809, 7, 3456, 23};
        int rezultat = redMinSifra(niz);
        System.out.println("Indeks elementa sa najvećom šifrom je: " + rezultat);
	}

	// Metod koji izračunava "šifru" broja
	public static int sifra(int x) {
		x = Math.abs(x);
		int last = x % 10;
		int first = x;
		int brCifara = 0;

		while (first >= 10) {
			first /= 10;
			brCifara++;
		}
		brCifara++; // za posljednju cifru

		return (first * last) + brCifara;
	}

	// Metod koji vraća indeks elementa sa najvećom šifrom (ako ima više, vrati
	// najmanji indeks)
	public static int redMinSifra(int[] a) {
		int maxSifra = sifra(a[0]);
		int index = 0;

		for (int i = 1; i < a.length; i++) {
			int s = sifra(a[i]);
			if (s > maxSifra) {
				maxSifra = s;
				index = i;
			}
		}

		return index;
	}
	
}
