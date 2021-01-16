package methodchain;

public class Peasant {

    public static final int MIN_X = 1;
    public static final int MAX_X = 8;
    public static final int MIN_Y = 1;
    public static final int MAX_Y = 8;

    private int posX;
    private int posY;

    public Peasant(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Peasant forward() {
        if (posX < Peasant.MAX_X) {
            posX++;
        }
        return this;
    }

    public Peasant backward() {
        if (posX > Peasant.MIN_X) {
            posX--;
        }
        return this;
    }

    public Peasant left() {
        if (posY > Peasant.MIN_Y) {
            posY--;
        }
        return this;
    }

    public Peasant right() {
        if (posY < Peasant.MAX_Y) {
            posY++;
        }
        return this;
    }

    public String toString() {
        return "x= " + posX + " , " + "y= " + posY;
    }

    public static void main(String[] args) {

        Peasant peasant = new Peasant(2,3)
                .forward()
                .forward()
                .left()
                .backward()
                .left()
                .forward()
                .right();
        System.out.println(peasant);
    }
}
