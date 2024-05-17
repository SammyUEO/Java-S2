public class Lei extends ContBancar {

    public Lei(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return this.getSuma();
    }

    public void transfer(ContBancar contDestinatie, float suma) {
        if (contDestinatie instanceof Lei) {
            if (this.getSuma() >= suma) {
                this.setSuma(this.getSuma() - suma);
                contDestinatie.setSuma(contDestinatie.getSuma() + suma);
            } else {
                System.out.println("Fonduri insuficiente pentru transfer.");
            }
        } else {
            System.out.println("Transferurile sunt permise doar între conturi în LEI.");
        }
    }
}
