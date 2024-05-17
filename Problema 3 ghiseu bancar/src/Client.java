import java.util.ArrayList;

public class Client {

    private String nume;
    private String adresa;
    private ArrayList<ContBancar> conturi;
    private final int MaxBancCounts = 5;

    public Client(String nume, String adresa, ContBancar... conturi) {
        if (conturi.length < 1 || conturi.length > MaxBancCounts) {
            throw new IllegalArgumentException("Un client trebuie să aibă cel puțin un cont și nu mai mult de 5.");
        }
        this.nume = nume;
        this.adresa = adresa;
        this.conturi = new ArrayList<ContBancar>(MaxBancCounts);
        for (ContBancar cont : conturi) {
            this.conturi.add(cont);
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public ArrayList<ContBancar> getConturi() {
        return conturi;
    }

    public void setConturi(ArrayList<ContBancar> conturi) {
        this.conturi = conturi;
    }

    public boolean addContBancar(ContBancar c) {
        if (conturi.size() < MaxBancCounts) {
            conturi.add(c);
            return true;
        }
        return false;
    }
}
