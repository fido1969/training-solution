package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int transactionsSmallerThanAmountCounter(List<Transaction> transactionList, int MaxAmount) {
        int transactionsSmallerThanAmount = 0;
        for (Transaction transaction : transactionList) {
            if (transaction.getAmount() < MaxAmount) {
                transactionsSmallerThanAmount++;
            }
        }
        return transactionsSmallerThanAmount;
    }
}
