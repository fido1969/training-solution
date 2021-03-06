package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    List<BankAccount> accountList = Arrays.asList(
            new BankAccount("Fred", "123-324-123", 100),
            new BankAccount("Kate", "133-324-123", 200),
            new BankAccount("Mary", "143-324-123", 90)
    );

    @Test
    public void testContainsBalanceGreaterThan() {

        BankAccountDecisionMaker test = new BankAccountDecisionMaker();

        assertTrue(test.containsBalanceGreaterThan(accountList, 150));
        assertFalse(test.containsBalanceGreaterThan(accountList, 250));

    }

}