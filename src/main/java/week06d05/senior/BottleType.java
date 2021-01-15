package week06d05.senior;

public enum BottleType {

    GLASS_BOTTLE(300), PET_BOTTLE(400);

    public final int maximumAmount;

    BottleType(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }
}
