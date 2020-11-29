package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    public void salespersonTest(){
        Salesperson salesperson = new Salesperson("Tamás",100_000);
        assertEquals(100_000,salesperson.getIncome());
        assertEquals("Tamás",salesperson.getName());
    }

}