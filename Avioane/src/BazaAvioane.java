public class BazaAvioane {

    public static void main(String[] args) {

        Avion boeing1 = new Boeing("bg14324", 500, 250);
        Avion concrude1 = new Concrude("cc22324", 750, 400);
        Avion mig1 = new Mig("mg13175", 2000);
        Avion tomCat1 = new TomCat("tm67493", 2500);

        Boeing actiuneBoeing1 = (Boeing) boeing1;
        Concrude actiuneConcrude1 = (Concrude) concrude1;
        Mig actiuneMig1 = (Mig) mig1;
        TomCat actiuneTomCat1 = (TomCat) tomCat1;

        actiuneBoeing1.decolare();
        actiuneBoeing1.zbor();
        actiuneBoeing1.aterizare();
        

        actiuneConcrude1.decolare();
        actiuneConcrude1.zbor();
        actiuneConcrude1.aterizare();
        actiuneConcrude1.mergiSupersonic();
        actiuneConcrude1.mergiSubsonic();
        
        actiuneMig1.decolare();
        actiuneMig1.zbor();
        actiuneMig1.aterizare();
        actiuneMig1.lanseazaRacheta();
        actiuneMig1.geometrieVitezaMare();
        actiuneMig1.geometrieNormala();
        
        actiuneTomCat1.decolare();
        actiuneTomCat1.zbor();
        actiuneTomCat1.aterizare();
        actiuneTomCat1.lanseazaRacheta();
        actiuneTomCat1.reumple();
    }

}
