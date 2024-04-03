public class PunctColorat extends Punct {
    private int r, g, b;
    private String rgb;

    public PunctColorat(int s, int l, int r, int g, int b) {
        super(s, l);
        this.r = r;
        this.g = g;
        this.b = b;
        this.rgb = "rgb(" + r + ", " + g + ", " + b + ")";
    }
}
