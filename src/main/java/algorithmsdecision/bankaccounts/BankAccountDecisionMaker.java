package algorithmsdecision.bankaccounts;

import java.util.List;

public class BankAccountDecisionMaker {

    public boolean containsBalanceGreaterThan(List<BankAccount> accountList, int min) {
        for (BankAccount account : accountList) {
            if (account.getBalance() > min) {
                return true;
            }
        }
        return false;
    }
}
