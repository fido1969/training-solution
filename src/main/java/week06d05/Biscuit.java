package week06d05;

public class Biscuit {
    //Junior/Mid level csoport mai gyakorlati feladata:
    //Készíts a week06d05 csomagban egy Biscuit nevű osztályt, amelynek van 2 attribútuma: BiscuitType type és int gramAmount.
    // A BiscuitType legyen felsorolásos típus a 3 kedvenc kekszfajtáddal. A Biscuit nevű osztálynak legyen egy static metódusa of néven,
    //mely paraméterként egy BiscuitType-ot, és egy int gramAmount-ot vár és visszaad egy új Biscuit objektumot amelyet a megadott paraméterek alapján hoz létre.
    // Bónusz feladat: konzolra írás esetén a Biscuit jelenítse meg a type és a gramAmount mezőket!

    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        if (type == null) {
            throw new IllegalArgumentException("Type is missing!");
        }
        if (gramAmount <= 0) {
            throw new IllegalArgumentException("There must be a valid gramm amount!");
        }
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public static Biscuit of(BiscuitType biscuitType, int gramAmount) {
        return new Biscuit(biscuitType, gramAmount);
    }

    @Override
    public String toString() {
        return "Biscuit{" +
                "type=" + type +
                ", gramAmount=" + gramAmount +
                '}';
    }

    public static void main(String[] args) {
        Biscuit biscuit0 = new Biscuit(BiscuitType.FIDO, 50);
        Biscuit biscuit1 =Biscuit.of(BiscuitType.MIZO,18);
        System.out.println(biscuit0);
        System.out.println(biscuit1);
    }
}
