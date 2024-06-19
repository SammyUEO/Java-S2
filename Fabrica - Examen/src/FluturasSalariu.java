
public class FluturasSalariu {
	
	private double valoareSalariu;
	private Angajat angajat;
	
	public FluturasSalariu(double valoareSalariu, Angajat angajat) {
		super();
		this.valoareSalariu = valoareSalariu;
		this.angajat = angajat;
	}
	
	
	public String getTip() {
		return "FluturasSalariu";
	}


	public double getValoareSalariu() {
		return valoareSalariu;
	}


	public Angajat getAngajat() {
		return angajat;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTip() + " ID: " + getId() + " Angajat: " + angajat.getNumeComplet();
	}
	



}
