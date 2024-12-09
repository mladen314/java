package java241009;

public class Main {

	public static void main(String[] args) {
        /*
		Ucenik ucenik1 = new Ucenik();
        ucenik1.ime = "Ana";
        ucenik1.razred = 3;

        Ucenik ucenik2 = new Ucenik();
        ucenik2.ime = "Marko";
        ucenik2.razred = 3;
*/
        
        Ucenik ucenik1 = new Ucenik("Ana", 3);
        Ucenik ucenik2 = new Ucenik("Marko", 3);
        ucenik1.predstaviSe();
        ucenik2.predstaviSe();	
	}

}
class Ucenik {
    public Ucenik(String ime, int razred) {
		this.ime = ime;
		this.razred = razred;
	}

	String ime;
    int razred;

    public void predstaviSe() {
        System.out.println("Zdravo, ja sam " + ime + " i pohađam " + razred + " razred.");
    }
}
