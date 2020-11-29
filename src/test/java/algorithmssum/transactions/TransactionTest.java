package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public  void transactionTest(){
        Transaction transaction = new Transaction("AN123_456",TransactionOperation.CREDIT,2_000_000);
        assertEquals("AN123_456",transaction.getAccountNumber());
        assertEquals("CREDIT",transaction.getTransactionOperation().toString());
        assertEquals(2_000_000,transaction.getAmount());
    }

}