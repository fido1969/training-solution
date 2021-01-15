package week06d05.senior;

public class Bottle {

    private BottleType type;
    private int filledUnit;

    public Bottle(BottleType type, int filledUnit) {
        if (filledUnit < 1) {
            throw new IllegalArgumentException("Quantity can not be smaller than 0!");
        }
        this.type = type;
        this.filledUnit = filledUnit;
    }

    public BottleType getType() {
        return type;
    }

    public int getFilledUnit() {
        return filledUnit;
    }

    public static Bottle of(BottleType bottleType) {
        return new Bottle(bottleType, 0);
    }

    public void fill(int fillAmount) {
        filledUnit += fillAmount;
        if (filledUnit > type.getMaximumAmount()){
            throw new IllegalArgumentException("Bottle is overloaded!");
        }
    }
}

