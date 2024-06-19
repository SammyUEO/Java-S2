
public class Main {
	 public static void main(String[] args) {
	        Fabrica fabrica = new Fabrica();
	        
	       
	        Muncitor muncitor = new Muncitor("Eusebiu", "Leontescu", 3000, 5);
	        Manager manager = new Manager("Bejan", "Rafel", 5000, 10);
	        fabrica.adaugaAngajat(muncitor);
	        fabrica.adaugaAngajat(manager);
	        
	        manager.adaugaSubordonat(muncitor);
	        System.out.println("Angajați:");
	        fabrica.afiseazaAngajati();

	       
	        Client client = new Client("Caleb");
	        fabrica.adaugaClient(client);
	        fabrica.genereazaContract(client, 15000);

	        
	        System.out.println("\nClienți:");
	        fabrica.afiseazaClienti();

	        
	        try {
	            fabrica.elibereazaFluturasSalariu(muncitor);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }

	        
	        System.out.println("\nActe:");
	        fabrica.afiseazaActe();
	    }
	}




