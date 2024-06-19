public class Oferta extends Act{
	
	private double valoareTotala;
	private Client client;
	
	public Oferta(String id, double valoareTotala, Client client) {
		super(id);
		this.valoareTotala = valoareTotala;
		this.client = client;
	}
	@Override
	public String getTip() {
		
		return "Oferta";
	}
	public double getValoareTotala() {
		return valoareTotala;
	}
	public Client getClient() {
		return client;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTip() + "ID: " + getId() + " Client: " + client.getNume();
		
	}
	
	

}
