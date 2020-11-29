package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson salesPersonWithMaxSalesAmount(List<Salesperson> salespersonList) {

        Salesperson salesPersonWithMaxSalesAmount = null;

        for (Salesperson salesperson : salespersonList) {
            if (salesPersonWithMaxSalesAmount == null || salesperson.getAmount() > salesPersonWithMaxSalesAmount.getAmount()) {
                salesPersonWithMaxSalesAmount = salesperson;
            }
        }
        return salesPersonWithMaxSalesAmount;
    }
}


