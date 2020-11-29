package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    public void salespersonTest() {
        Salesperson salesperson = new Salesperson("Anna", 1_500_000, 1_000_000);
        assertEquals(1_500_000,salesperson.getAmount());
        assertEquals("Anna",salesperson.getName());
        assertEquals(1_000_000,salesperson.getTarget());
        assertEquals(500_000,salesperson.getDifferenceFromTarget());
    }
}