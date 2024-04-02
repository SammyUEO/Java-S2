public class Avion {
    private String idAvion;
    private int putereTotalaMotor;
    
    public Avion(String idAvion, int putereTotalaMotor) {
        this.idAvion = idAvion;
        this.putereTotalaMotor = putereTotalaMotor;
    }
    
    public String getIdAvion() {
        return idAvion;
    }
    
    public int getPutereTotalaMotor() {
        return putereTotalaMotor;
    }
    
    public void decolare() {
        System.out.println(idAvion + " Inițiere procedură de decolare");
        System.out.println("Pornire motoare");
        System.out.println("Accelerare pe pistă");
        System.out.println("Decolare");
        System.out.println("Retractare tren de aterizare");
        System.out.println("Decolare completă\n");
    }
    
    public void zbor() {
        System.out.println(idAvion + " Zbor\n");
    }
    
    public void aterizare() {
        System.out.println(idAvion + " Inițiere procedură de aterizare");
        System.out.println("Activare frâne de aer");
        System.out.println("Coborâre tren de aterizare");
        System.out.println("Contact cu pistă");
        System.out.println("Decelerare");
        System.out.println("Oprire motoare");
        System.out.println("Aterizare completă\\n");
    }
}
