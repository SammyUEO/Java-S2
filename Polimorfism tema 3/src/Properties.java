public abstract class Properties {

    private Address address;
    private int price, area;

    public Properties(Address address, int price, int area) {
    	
        this.address = address;
        this.price = price;
        this.area = area;
    }

    public Address getAddress() {
        return address;
    }

    public int getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    public abstract int priceToPay();

    public String displayButterfly() {
    	
        return  "\n    " + getClass().getName() + ": " + address.getStreet() + " No." + address.getNumber() +
                "\n              Area: " + this.getArea() +
                "\n              Cost:" + this.priceToPay() + "\n";
    }
}
