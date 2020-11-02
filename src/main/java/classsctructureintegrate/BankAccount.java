package classsctructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public String getInfo() {
        return getOwner() + " (" + getAccountNumber() + "): " + getBalance() + " Ft";
    }

    public void transfer(BankAccount to, int amount) {
        withdraw(amount);
        to.deposit(amount);
    }

}
