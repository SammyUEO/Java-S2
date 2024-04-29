public class Building extends Properties {

    public Building(Address address, int area) {
    	
        super(address, 500, area);
    }

    public int priceToPay() {
    	
        return this.getPrice() * this.getArea();
    }
}
