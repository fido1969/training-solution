package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    public void bankAccountConditionCounterTest(){
        BankAccountConditionCounter bankAccountConditionCounter = new BankAccountConditionCounter();
        List<BankAccount> bankAccountList= new ArrayList<>();
        bankAccountList.add(new BankAccount("Janos","AI369-852",5_000_000));
        bankAccountList.add(new BankAccount("John","AI369-853",500_000));
        assertEquals(1,bankAccountConditionCounter.bankAccountConditionCounter(bankAccountList,500_000));
    }

}