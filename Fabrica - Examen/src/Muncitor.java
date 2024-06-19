import java.util.ArrayList;
import java.util.List;

public class Muncitor extends Angajat{
	private List<String> responsabilitati;
	
	public Muncitor(String nume, String prenume, double salariuBaza, int aniVechime) {
		super(nume, prenume, salariuBaza, aniVechime);
		this.responsabilitati = new ArrayList<>();
	}
	
	public void adaugaResponsabilitate(String responsabilitate) {
		responsabilitati.add(responsabilitate);
	}
	

	public List<String> getResponsabilitati() {
		return responsabilitati;
	}

	@Override
	public String getFunctie() {
		return "Muncitor";
	}
	

}
