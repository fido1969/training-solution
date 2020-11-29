package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void transactionTest(){
        Transaction transaction = new Transaction("AN123-456",TransactionType.DEBIT,200_000);
        assertEquals("AN123-456",transaction.getAccountNumber());
        assertEquals("DEBIT",transaction.getTransactionType().toString());
        assertEquals(200_000,transaction.getAmount());
    }
}