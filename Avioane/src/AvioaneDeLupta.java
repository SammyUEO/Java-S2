public class AvioaneDeLupta extends Avion {

    public AvioaneDeLupta(String idAvion, int putereTotalaMotor) {
        super(idAvion, putereTotalaMotor);
    }
    
    public void lanseazaRacheta() {
        System.out.println(getIdAvion() + " Inițiere procedură de lansare a rachetei");
        System.out.println("Achiziționare țintă");
        System.out.println("Lansare rachetă");
        System.out.println("Retragere");
        System.out.println("Lansare rachetă completă\n");
    }

}

