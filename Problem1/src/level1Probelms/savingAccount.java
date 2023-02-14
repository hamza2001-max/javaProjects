package level1Probelms;

import Exception.InterestException;

public class savingAccount extends Account {

    public savingAccount(double balance, double InterestRate) {
        super(balance);
        this.InterestRate = InterestRate;
    }

    private double defaultInterestRate = 2.25;
    double InterestRate;

    public void setDefaultInterestRate(double rate) {
        defaultInterestRate = rate;
    }

    public double applyMonthlyInterest() throws InterestException{
        if(balance == 0){
            throw new InterestException("Invalid Amount");
        }
        if (balance <= 10000) {
            return balance * defaultInterestRate / 100;
        } else {
            return balance * InterestRate / 100;
        }
    }
}
