package thebanksystem;

import Exception.AccountNotFound;
import Exception.ExceedingLimit;
import Exception.ExceedingWithLimit;
import Exception.InvalidAmount;
import java.io.Serializable;
import javax.swing.DefaultListModel;

public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;
    static BankAccount[] account = new BankAccount[100];
    int iteration = 100;

    public int addAccount(BankAccount acc) {
        /*loops through the array, and checks if an
        index is null, so that it can be filled with
        the arguement "acc".*/
        int i = 0;
        for (i = 0; i < iteration; i++) {
            if (getAccount()[i] == null) {
                break;
            }
        }
        getAccount()[i] = acc;
        return i;
    }

    public int addAccount1(String name, double balance, String tradeLicenseNumber) throws Exception {
        CurrentAccount acc = new CurrentAccount(name, balance, tradeLicenseNumber);
        return this.addAccount(acc);
    }

    public int addAccount2(String name, double balance, double maxWithLimit) {
        SavingAccount acc = new SavingAccount(name, balance, maxWithLimit);
        return this.addAccount(acc);
    }

    public int addAccount3(String name, double balance, String InstitutionName) {
        StudentAccount acc = new StudentAccount(name, balance, InstitutionName);
        return this.addAccount(acc);
    }

    public BankAccount findAccount(String accNumber) {
        int i;
        for (i = 0; i < iteration; i++) {
            if (getAccount()[i] == null) {
                break;
            }
            if (getAccount()[i].accountNumber.equals(accNumber));
            return getAccount()[i];
        }
        return null;
    }

    public void WithDraw(double amount, String AccountNumber) throws InvalidAmount, ExceedingWithLimit, AccountNotFound, ExceedingLimit {
        BankAccount temp = findAccount(AccountNumber);
        if (amount <= 0) {
            throw new InvalidAmount("Invalid Amount");
        }
        if (amount > temp.getBalance()) {
            throw new ExceedingWithLimit("Amount Exceeds Balance");
        }
        if (temp == null) {
            throw new AccountNotFound("Account Not Found");
        }
        if (temp != null) {
            temp.withdraw(amount);
        }
    }

    public DefaultListModel<String> Display() {
        DefaultListModel<String> list = new DefaultListModel<>();
        for (int i = 0; i < iteration; i++) {
            if (getAccount()[i] == null) {
                break;
            }
            list.addElement(getAccount()[i].toString());
        }
        return list;
    }

    public void deposit(String AccountNumber, double amount) throws InvalidAmount, AccountNotFound {
        if (amount < 0) {
            throw new InvalidAmount("Invalid Amount");
        }
        BankAccount temp = findAccount(AccountNumber);
        if (temp == null) {
            throw new AccountNotFound("Account was not found");
        }
        if (temp != null) {
            temp.deposit(amount);
        }
    }

    public static BankAccount[] getAccount() {
        return account;
    }

    public Object[] getAccounts() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
