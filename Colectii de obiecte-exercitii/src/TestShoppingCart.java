public class TestShoppingCart {

	public static void main(String[] args) {

		Product p1 = new Product("chitara bass",2999.99);
		
		Product p2 = new Product("pian",4000);
		
		ShoppingCart sc = new ShoppingCart();

		sc.addProduct(p1);
		
		sc.addProduct(p2);
		
		System.out.println(sc.getSum());

	}

}