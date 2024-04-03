public class Mig extends AvioaneDeLupta {

    public Mig(String idAvion, int putereTotalaMotor) {
        super(idAvion, putereTotalaMotor);
    }

    public void geometrieVitezaMare() {
        System.out.println(getIdAvion() + " Geometrie de mare viteză selectată\n");
    }

    public void geometrieNormala() {
        System.out.println(getIdAvion() + " Geometrie normală selectată\n");
    }
}
