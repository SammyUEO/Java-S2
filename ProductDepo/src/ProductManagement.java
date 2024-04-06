
public class ProductManagement {

	public static void main(String[] args) {
		
		Warehouse warehouse = new Warehouse();
		
		Product p1 = new CompensableProducts(123456, "Coffee",23,1);
		Product p2 = new NoncompensableProducts(132456,"Bread",5);
		Product p3 = new NoncompensableProducts(132456,"Bread",5);
		
		warehouse.addProduct(p1);
		warehouse.addProduct(p2);
		warehouse.addProduct(p3);
		
		warehouse.printProducts();

	}

}
