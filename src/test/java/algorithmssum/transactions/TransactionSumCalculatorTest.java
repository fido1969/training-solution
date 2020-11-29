package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    public void transactionSumCalculatorTest1() {
        List<Transaction> transactionList = new ArrayList<>();
        assertEquals(0, transactionList.size());
    }

    @Test
    public void transactionSumCalculatorTest() {
        TransactionSumCalculator transactionSumCalculator = new TransactionSumCalculator();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("AN123_456", TransactionOperation.CREDIT, 2_000_000));
        transactionList.add(new Transaction("AN123_457", TransactionOperation.DEBIT, 1_000_000));
        assertEquals(2, transactionList.size());
        assertEquals("AN123_456",transactionList.get(0).getAccountNumber());
        assertEquals("CREDIT",transactionList.get(0).getTransactionOperation().toString());
        assertEquals(2_000_000,transactionSumCalculator.sumAmountOfCreditEntries(transactionList));
    }

}