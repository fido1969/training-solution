package statements;

public class Investment {

    private double cost = 0.003;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return (fund * interestRate * days / (100 * 365));
    }

    public double close(int days) {
        double withdrawAmount = (getFund() + getYield(days)) * (1 - cost);
        double payCash = active ? withdrawAmount : 0;
        active = false;
        return payCash;
    }
}
