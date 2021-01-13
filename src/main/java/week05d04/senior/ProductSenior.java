package week05d04.senior;

public class ProductSenior {

    private long price;
    private CurrencyType currency;

    public ProductSenior(long price, CurrencyType currency) {
        if (currency != CurrencyType.HUF && currency != CurrencyType.USD && currency == null) {
            throw new IllegalArgumentException("Currency must be HUF or USD");
        }
        this.price = price;
        this.currency = currency;
    }

    public double convertPrice(CurrencyType currency) {
        if (this.currency == currency) {
            return price;
        }
        if (currency == CurrencyType.HUF) {
            return price * CurrencyType.USD.getRate();
        }
        return price / CurrencyType.USD.getRate();
    }

    public long getPrice() {
        return price;
    }

    public CurrencyType getCurrency() {
        return currency;
    }


}
