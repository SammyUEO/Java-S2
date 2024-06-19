public abstract class Angajat{
	
	private String nume;
	private String prenume;
	private double salariuBaza;
	private int aniVechime;
	
	public Angajat(String nume, String prenume, double salariuBaza, int aniVechime) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.salariuBaza = salariuBaza;
		this.aniVechime = aniVechime;
	}

	public double getSalariuBaza() {
		return salariuBaza * (1 + 0.1 * aniVechime);
	}
	
	public String getNumeComplet() {
		return nume + " " + prenume;
	}
	
	public abstract String getFunctie();

	@Override
	public String toString() {
		
		return getNumeComplet() + " (" + getFunctie() + ")";
	}
	
	
	
}