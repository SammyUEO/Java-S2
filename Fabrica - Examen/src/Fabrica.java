
import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	  	private List<Angajat> angajati;
	    private List<Client> clienti;
	    private List<Act> acte;

	    public Fabrica() {
	        this.angajati = new ArrayList<>();
	        this.clienti = new ArrayList<>();
	        this.acte = new ArrayList<>();
	    }

	    public void adaugaAngajat(Angajat angajat) {
	        angajati.add(angajat);
	    }

	    public void concediazaAngajat(Angajat angajat) {
	        angajati.remove(angajat);
	    }

	    public void afiseazaAngajati() {
	        for (Angajat angajat : angajati) {
	            System.out.println(angajat);
	        }
	    }

	    public void adaugaClient(Client client) {
	        clienti.add(client);
	    }

	    public void afiseazaClienti() {
	        for (Client client : clienti) {
	            System.out.println(client);
	        }
	    }

	    public void genereazaContract(Client client, double valoareTotala) {
	        Oferta oferta = new Oferta( valoareTotala, client);
	        acte.add(oferta);
	    }

	    public void elibereazaFluturasSalariu(Angajat angajat) throws Exception {
	        if (!angajati.contains(angajat)) {
	            throw new Exception("Angajatul a fost concediat.");
	        }
	        FluturasSalariu fluturas = new FluturasSalariu(angajat.getSalariu(), angajat);
	        acte.add(fluturas);
	    }

	    public void afiseazaActe() {
	        for (Act act : acte) {
	            System.out.println(act);
	        }
	    }
}
