public class Concrude extends AvioaneDeCalatorie {

    public Concrude(String idAvion, int putereTotalaMotor, int maxPasageri) {
        super(idAvion, putereTotalaMotor, maxPasageri);      
    }

    public void mergiSupersonic() {
        System.out.println(getIdAvion() + " Mod supersonic activat\n");
    }

    public void mergiSubsonic() {
        System.out.println(getIdAvion() + " Mod supersonic dezactivat\n");
    }

}
