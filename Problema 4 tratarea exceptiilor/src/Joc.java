class Joc {
    private String echipa1, echipa2;
    private int goluriEchipa1, goluriEchipa2, numarOuturi, numarCornere;
    private int numarSuturi;
    private Ball minge;

    public Joc(String echipa1, String echipa2, int numarSuturi, Ball minge) {
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.goluriEchipa1 = 0;
        this.goluriEchipa2 = 0;
        this.numarOuturi = 0;
        this.numarCornere = 0;
        this.numarSuturi = numarSuturi;
        this.minge = minge;
    }

    public void simuleaza() {
        CoordinateGenerator generator = new CoordinateGenerator();

        for (int i = 0; i < numarSuturi; i++) {
            try {
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
                minge.suteaza(generator);
            } catch (OutException e) {
                numarOuturi++;
                System.out.println("Out! Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
                minge = new Ball(minge.getX(), minge.getY(), minge.getField());
            } catch (GolException e) {
                if (minge.getX() == 0) {
                    goluriEchipa2++;
                } else {
                    goluriEchipa1++;
                }
                System.out.println("Gol! Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
                minge = new Ball(50, 25, minge.getField());
            } catch (CornerException e) {
                numarCornere++;
                System.out.println("Corner! Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
                if (minge.getX() == 0) {
                    minge = new Ball(0, minge.getY() < 25 ? 0 : 50, minge.getField());
                } else {
                    minge = new Ball(100, minge.getY() < 25 ? 0 : 50, minge.getField());
                }
            }
        }
    }

    public void results() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Joc: " + echipa1 + " vs " + echipa2 + "\n" +
               "Scor: " + goluriEchipa1 + " - " + goluriEchipa2 + "\n" +
               "Outuri: " + numarOuturi + "\n" +
               "Cornere: " + numarCornere + "\n";
    }
}
