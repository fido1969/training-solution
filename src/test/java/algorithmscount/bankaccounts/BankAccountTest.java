package algorithmscount.bankaccounts;

import classsctructureintegrate.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void bankAccountTest(){
        BankAccount bankAccount= new BankAccount("János","AN333-222",5_000_000);
        assertEquals(5_000_000,bankAccount.getBalance());
        assertEquals("AN333-222",bankAccount.getAccountNumber());
        assertEquals("János",bankAccount.getName());
    }

}