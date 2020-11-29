package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    public  void salesAmountSumCalculatorTest(){
        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();
        List<Salesperson> salespersonList = new ArrayList<>();
        salespersonList.add(new Salesperson("Laci",100_000));
        salespersonList.add(new Salesperson("Mari",100_000));
        salespersonList.add(new Salesperson("Laci",100_000));
        assertEquals(300_000,salesAmountSumCalculator.salesAmountSumCalculator(salespersonList));
    }
}