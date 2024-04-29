public class Land extends Properties {

    private LocationRank locationRank;

    public Land(Address address, int area, LocationRank locationRank) {
    	
        super(address, 300, area);
        this.locationRank = locationRank;
    }

  
    public int priceToPay() {
    	
        return this.getPrice() * this.getArea() / locationRank.getRank();
    }

    public String displayButterfly() {
    	
        return "\n    " + getClass().getName() + ": " + this.getAddress().getStreet() + " No." + this.getAddress().getNumber() +
               "\n          Area: " + this.getArea() + ", Rank: " + locationRank.getRank() +
               "\n          Cost:" + this.priceToPay() + "\n";

    }
}
