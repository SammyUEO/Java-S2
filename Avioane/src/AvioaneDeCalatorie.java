public class AvioaneDeCalatorie extends Avion {
    
    private int maxPasageri;

    public AvioaneDeCalatorie(String idAvion, int putereTotalaMotor, int maxPasageri) {
        super(idAvion, putereTotalaMotor);
        this.maxPasageri = maxPasageri;
    }

    public int getMaxPasageri() {
        return maxPasageri;
    }
}
