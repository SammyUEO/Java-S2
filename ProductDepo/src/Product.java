
public class Product {
	
	private long code;
	private String name;
	private double price;
	private int quantity;
	
	
	public Product(long code, String name, double price) {
		
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = 1;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public long getCode() {
		return code;
	}


	public String getName() {
		return name;
	}
	
	public boolean equal( Product p) {
		
		if(getCode() == (p.getCode())&& getName().contentEquals(p.getName()))
		{
			return true;
			
		}else {
			
			return false;
		}
	}
	public String toString() {
		
		return "The code is: " + getCode() + ", Name: " + getName() + " , Price: " + getPrice() + ", Quantity: " + getQuantity();
	}
	

}
