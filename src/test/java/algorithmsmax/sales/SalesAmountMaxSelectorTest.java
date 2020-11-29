package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountMaxSelectorTest {

    List<Salesperson> salespersonList = Arrays.asList(
            new Salesperson("John", 600, 500),
            new Salesperson("Bill", 200, 300),
            new Salesperson("Kate", 700, 100),
            new Salesperson("Mary", 700, 300),
            new Salesperson("Karl", 200, 50)
    );

    @Test
    public void salespersonTest(){
        SalesAmountMaxSelector salesAmountMaxSelector = new SalesAmountMaxSelector();
        assertEquals(700,salesAmountMaxSelector.salesPersonWithMaxSalesAmount(salespersonList).getAmount());
        assertEquals(100,salesAmountMaxSelector.salesPersonWithMaxSalesAmount(salespersonList).getTarget());
        assertEquals(600,salesAmountMaxSelector.salesPersonWithMaxSalesAmount(salespersonList).getDifferenceFromTarget());
        assertEquals("Kate",salesAmountMaxSelector.salesPersonWithMaxSalesAmount(salespersonList).getName());
    }
    @Test
    public void salesPersonWithFurthestAboveTargetSelectorTest() {
        SalespersonWithFurthestAboveTargetSelector salespersonWithFurthestAboveTargetSelector = new SalespersonWithFurthestAboveTargetSelector();
        assertEquals(700, salespersonWithFurthestAboveTargetSelector.selectSalesPersonWithFurthestAboveTarget(salespersonList).getAmount());
        assertEquals(100, salespersonWithFurthestAboveTargetSelector.selectSalesPersonWithFurthestAboveTarget(salespersonList).getTarget());
        assertEquals(600, salespersonWithFurthestAboveTargetSelector.selectSalesPersonWithFurthestAboveTarget(salespersonList).getDifferenceFromTarget());
    }

    @Test
    public void salesPersonWithFurthestBelowTargetSelectorTest() {
        SalespersonWithFurthestBelowTargetSelector salespersonWithFurthestBelowTargetSelector = new SalespersonWithFurthestBelowTargetSelector();
        assertEquals(200, salespersonWithFurthestBelowTargetSelector.selectSalesPersonWithFurthestBelowTarget(salespersonList).getAmount());
        assertEquals(300, salespersonWithFurthestBelowTargetSelector.selectSalesPersonWithFurthestBelowTarget(salespersonList).getTarget());
        assertEquals(-100, salespersonWithFurthestBelowTargetSelector.selectSalesPersonWithFurthestBelowTarget(salespersonList).getDifferenceFromTarget());
    }
}