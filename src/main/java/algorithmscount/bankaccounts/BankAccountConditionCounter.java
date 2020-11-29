package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int bankAccountConditionCounter(List<BankAccount> bankAccountList, int minBalance) {
        int countHiherBalance = 0;
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getBalance() > minBalance) {
                countHiherBalance++;
            }
        }
        return countHiherBalance;
    }
}
