package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    public void transactionCounterTest() {
        TransactionCounter transactionCounter = new TransactionCounter();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("AN466-987", TransactionType.DEBIT, 5_000_000));
        assertEquals(1,transactionCounter.transactionsSmallerThanAmountCounter(transactionList,10_000_000));
    }

    @Test
    public void transactionCounterTest1() {
        TransactionCounter transactionCounter = new TransactionCounter();
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(new Transaction("AN466-988", TransactionType.REDIT, 155_000_000));
        assertEquals(0,transactionCounter.transactionsSmallerThanAmountCounter(transactionList,10_000_000));
        assertEquals(1,transactionList.size());
    }

}