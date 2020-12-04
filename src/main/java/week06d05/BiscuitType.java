package week06d05;

public enum BiscuitType {

    FITI(15), MIZO(10), FIDO(14);

    private final int gramAmount;

    BiscuitType(int gramAmount) {
        this.gramAmount = gramAmount;
    }

    public int getGramAmount() {
        return gramAmount;
    }
}
