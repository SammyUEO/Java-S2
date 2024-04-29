import java.util.ArrayList;

public class Contributor {

    private String name, CNP;
    
    ArrayList<Properties> listProperties;

    public Contributor(String name, String CNP) {
    	
        this.name = name;
        this.CNP = CNP;
        this.listProperties = new ArrayList<Properties>();
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public boolean addProperties(Properties p) {
    	
        listProperties.add(p);
        return true;
    }

    public int totalPrice() {
    	
        int sum = 0;
        
        for (Properties property : listProperties) {
            sum += property.priceToPay();
        }
        return sum;
    }

    public String butterfly() {
    	
        StringBuilder butterfly = new StringBuilder();
        
        butterfly.append("Contributor: ").append(name).append("\n\nProperties\n");
        
        for (Properties property : listProperties) {
        	
            butterfly.append(property.displayButterfly());
        }
        
        butterfly.append("\nSuma totala: ").append(totalPrice());
        return butterfly.toString();
    }
}
