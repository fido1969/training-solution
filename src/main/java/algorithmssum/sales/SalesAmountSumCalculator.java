package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int salesAmountSumCalculator(List<Salesperson> salespersonList) {
        int sumIncome = 0;
        for (Salesperson salesperson : salespersonList) {
            sumIncome += salesperson.getIncome();
        }
        return sumIncome;
    }
}
