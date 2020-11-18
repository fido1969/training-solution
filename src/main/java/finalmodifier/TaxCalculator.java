package finalmodifier;

public class TaxCalculator {
    public static final double PERCENT = 27;

    public double tax(double price) {
        return price * PERCENT / 100;
    }

    public double priceWithTax(double price) {
        return price + (price * PERCENT / 100);
    }

    public static void main(String[] args) {
        System.out.println("Tax of the given price: " + new TaxCalculator().tax(100_000));
        System.out.println("The given price with tax: " + new TaxCalculator().priceWithTax(100_000));
    }

}
