package week05d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void createConstroctorNameTest() {
        Product product = new Product("Milk", 2020, 11, 25);
        assertEquals("Milk", product.getName());
    }

    @Test
    public void createConstroctorExpirationDayTest() {
        assertEquals(LocalDate.of(2020, 11, 25), new Product("Milk", 2020, 11, 25).getExpirationDay());
    }

    @Test
    public void isExpiredTrueTest() {
        Product product = new Product("Milk", 2020, 11, 25);
        assertEquals(true, product.isExpired());
    }

    @Test
    public void isExpiredFalseTest() {
        Product product = new Product("Milk", 2020, 11, 29);
        assertEquals(false, product.isExpired());
    }

    @Test
    public void isExpiredFalseNowTest() {
        Product product = new Product("Milk", 2020, 11, 26);
        assertEquals(false, product.isExpired());
    }


}
