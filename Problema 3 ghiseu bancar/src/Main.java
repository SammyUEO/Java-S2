
public class Main {

	public static void main(String[] args) {

		ContBancar cb1 = new Lei("12345678",2500);
		ContBancar cb2 = new Euro("87654321",1000);
		
		Client c1 = new Client("Sammy","Victoriei",cb1,cb2);
		
		Banca b = new Banca("350350");
		
		b.addClient(c1);
		
		
		b.afisareClient("Sammy");

	}

}