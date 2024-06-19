import java.util.ArrayList;
import java.util.List;

public class Manager extends Angajat{
	
	private List<Muncitor> subordonati;

	public Manager(String nume, String prenume, double salariuBaza, int aniVechime) {
		super(nume, prenume, salariuBaza, aniVechime);
		this.subordonati = new ArrayList<>();
	}
	public void adaugaSubordonat(Muncitor muncitor) {
		subordonati.add(muncitor);
	}
	public List<Muncitor> getSubordonati() {
		return subordonati;
	}
	@Override
	public String getFunctie() {
		// TODO Auto-generated method stub
		return "Manager";
	}
	
	

}
