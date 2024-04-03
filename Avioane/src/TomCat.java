public class TomCat extends AvioaneDeLupta {

    public TomCat(String idAvion, int putereTotalaMotor) {
        super(idAvion, putereTotalaMotor);
    }

    public void reumple() {
        System.out.println(getIdAvion() + " Inițiere procedură de reumplere");
        System.out.println("Localizare avion cisternă");
        System.out.println("Apropiere");
        System.out.println("Reumplere");
        System.out.println("Reumplere completă\n");
    }
}
