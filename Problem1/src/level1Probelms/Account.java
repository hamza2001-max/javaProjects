package level1Probelms;

import Exception.DepositException;
import Exception.withDrawException;

public class Account {

    double balance = 0.0;

    public Account(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount) throws DepositException {
        if (amount <= 0) {
            throw new DepositException("Invalid Amount");
        }
        return balance += amount;
    }

    public double withDraw(double amount) throws withDrawException {
        if (balance <= 0 || balance - amount < 0) {
            throw new withDrawException("Operation causes balance to be in negative");
        }
        return balance -= amount;
    }
    
    public double getBalance(){
        return balance;
    }
}
