package thebanksystem;

import Exception.ExceedingLimit;
import Exception.ExceedingWithLimit;
import Exception.InvalidAmount;

public class SavingAccount extends BankAccount {

    public static final long serialVersionUID = 1l;
    double maxWithLimit;
    double rate = 0.5;

    public SavingAccount(String name, double balance, double maxWithLimit) {
        super(name, balance, 3000);
        this.maxWithLimit= maxWithLimit;
    }

    public double getNetBalance() {
        return getBalance() * rate;
    }

    public void withDraw(double amount) throws ExceedingWithLimit, InvalidAmount, ExceedingLimit {
        if (amount < maxWithLimit) {
            super.withdraw(amount);
        }
        throw new ExceedingWithLimit("WithDraw exceeds the limit");
    }
}
