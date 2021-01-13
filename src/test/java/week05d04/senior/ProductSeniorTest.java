package week05d04.senior;

import org.junit.jupiter.api.Test;
import week05d04.senior.CurrencyType;
import week05d04.senior.ProductSenior;

import static org.junit.jupiter.api.Assertions.*;

class ProductSeniorTest {

    @Test
    void getPrice() {
        assertEquals(150,new ProductSenior(150, CurrencyType.HUF).getPrice());
    }

    @Test
    void getCurrency() {
        assertEquals(CurrencyType.HUF,new ProductSenior(150,CurrencyType.HUF).getCurrency());
    }

    @Test
    void createProductSenior() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new ProductSenior(1500, null));
        assertEquals("Currency must be HUF or USD", iae.getMessage());
    }

    @Test
    void convertPriceHUF() {
        ProductSenior productSenior = new ProductSenior(1500, CurrencyType.HUF);
        assertEquals(5, productSenior.convertPrice(CurrencyType.USD));
        assertEquals(1500, productSenior.convertPrice(CurrencyType.HUF));
        assertEquals(600,new ProductSenior(2,CurrencyType.USD).convertPrice(CurrencyType.HUF));
    }

    @Test
    void convertPriceUSD() {
        ProductSenior productSenior = new ProductSenior(22, CurrencyType.USD);
        assertEquals(22, productSenior.convertPrice(CurrencyType.USD));
        assertEquals(6600, productSenior.convertPrice(CurrencyType.HUF));
        assertEquals(0.5,new ProductSenior(150,CurrencyType.HUF).convertPrice(CurrencyType.USD));
    }

}