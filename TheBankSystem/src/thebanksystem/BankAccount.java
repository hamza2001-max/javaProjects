package thebanksystem;

import Exception.ExceedingLimit;
import Exception.InvalidAmount;
import java.io.Serializable;

public class BankAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    double balance;
    double minAmount;
    String name, accountNumber;

    public BankAccount(String name, double balance, double minAmount) {
        this.name = name;
        this.balance = balance;
        this.minAmount = minAmount;
        accountNumber = 10000 + (int) (Math.random() * 89999) + "";
    }

    public double deposit(double amount) throws InvalidAmount {
        if (amount < 0) {
            throw new InvalidAmount("Invalid Amount");
        }
        return balance += amount;
    }

    public double withdraw(double amount) throws InvalidAmount, ExceedingLimit {
        if (amount <= 0) {
            throw new InvalidAmount("Invalid Amount");
        }
        if (amount > getBalance()) {
            throw new ExceedingLimit("withdraw Exceeds Amount");
        }
        return balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Account Num: " + accountNumber + " balance " + balance + " Minimum Amount " + minAmount + " Type: " + this.getClass();
    }
}
