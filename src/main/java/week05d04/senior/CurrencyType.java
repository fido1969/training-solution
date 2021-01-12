package week05d04.senior;

public enum CurrencyType {
    HUF(1.0),USD(300.0);

    public final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}

