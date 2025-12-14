package Biblioteka25;

// Fajl Knjiga.java

public class Knjiga {
	private String naslov;
	private String autor;
	private int godina;
	private int brojStrana;
	private double cijena;
	private String zanr;

	// Konstruktor
	public Knjiga(String naslov, String autor, int godina, int brojStrana, double cijena, String zanr) {
		this.naslov = naslov;
		this.autor = autor;
		this.godina = godina;
		this.brojStrana = brojStrana;
		this.cijena = cijena;
		this.zanr = zanr;
	}

	// Geteri i seteri
	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

	public String getZanr() {
		return zanr;
	}

	public void setZanr(String zanr) {
		this.zanr = zanr;
	}

	// Metod opis()
	public String opis() {
		return "'" + naslov + "' autora " + autor + ", žanr: " + zanr + ", " + godina + ", broj strana: " + brojStrana
				+ ", cijena: " + cijena + "€";
	}

	// Metod cijenaSaDodacima()
	public double cijenaSaDodacima() {
		double dodatak = 0;

		if (brojStrana > 500) {
			dodatak = cijena * 0.10;
		} else if (brojStrana > 300) {
			dodatak = cijena * 0.05;
		}

		double finalnaCijena = cijena + dodatak;

		if (zanr.equalsIgnoreCase("poezija")) {
			finalnaCijena -= finalnaCijena * 0.03;
		}

		return finalnaCijena;
	}
}
