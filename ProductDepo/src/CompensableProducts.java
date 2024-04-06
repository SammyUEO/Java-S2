
public class CompensableProducts extends Product {
	
	private double coefficient;

	public CompensableProducts(long code,String name,double price,double coefficient) {
		
		super(code,name,price);
		
		this.coefficient = coefficient;
	}

	public double getCoefficient() {
		
		return coefficient;
	}
	
	public String toString() 
	{
	return "The code is: " + getCode() + ", Name: " + getName() + " , Price: " + (getPrice()*getCoefficient())+ ", Quantity: " + getQuantity();

	}
}
