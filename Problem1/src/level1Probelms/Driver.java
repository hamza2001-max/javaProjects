package level1Probelms;

import Exception.DepositException;
import Exception.withDrawException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) throws DepositException, withDrawException {
        Scanner input = new Scanner(System.in);
        savingAccount savAcc;

        System.out.println("First of all make an account");
        System.out.println("Enter a balance to make an account: ");
        double balance = input.nextDouble();
        System.out.println("Now Enter an Interest rate: ");
        double interest = input.nextDouble();

        savAcc = new savingAccount(balance, interest);

            System.out.println("The Banking System");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Set the Default Interest Rate");
            System.out.println("5.Monthly Interest");
            System.out.println("6.Exit");
            System.out.println("Enter a key (1/2/3/4/5/6):");
            
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: ");
                    System.out.println(savAcc.getBalance());
                    break;
                case 2:
                    System.out.println("Enter an amount to deposit: ");
                    double amount1 = input.nextDouble();
                    System.out.println("New Balance: ");
                    System.out.println(savAcc.deposit(amount1));
                    break;
                case 3:
                    System.out.println("Enter an amount to withdraw: ");
                    double amount2 = input.nextDouble();
                    System.out.println("New Balance: ");
                    System.out.println(savAcc.withDraw(amount2));
                    break;
                case 4:
                    System.out.println("Enter the default Interest Rate: ");
                    double rate = input.nextDouble();
                    savAcc.setDefaultInterestRate(rate);
                    break;
                case 5:
                    System.out.println("The monthly Interest rate: ");
                    System.out.println(savAcc.applyMonthlyInterest());
                    break;
                case 6:
                    System.exit(0);
            }
        }

    }
}
