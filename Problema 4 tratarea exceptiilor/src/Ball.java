
class Ball {
    private int x, y;
    private Field field;

    public Ball(int x, int y, Field field) {
        this.x = x;
        this.y = y;
        this.field = field;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Field getField() {
        return field;
    }

    public void suteaza(CoordinateGenerator generator) throws OutException, GolException, CornerException {
        x = generator.generateX();
        y = generator.generateY();
        
        if (y == 0 || y == 50) {
            throw new OutException();
        } else if ((x == 0 || x == 100) && y >= 20 && y <= 30) {
            throw new GolException();
        } else if (x == 0 || x == 100) {
            throw new CornerException();
        }
    }
}
