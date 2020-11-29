package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {

    int sumAmountOfCreditEntries(List<Transaction> transactionList) {
        int sumCredit = 0;
        for (Transaction transaction : transactionList) {
            if (transaction.getTransactionOperation() == TransactionOperation.CREDIT) {
                sumCredit += transaction.getAmount();
            }
        }
        return sumCredit;
    }
}
