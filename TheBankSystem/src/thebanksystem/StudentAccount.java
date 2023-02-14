package thebanksystem;

public class StudentAccount extends BankAccount {

    private static final long serialVersionUID = 1L;
    String InstitutionName;

    public StudentAccount(String name, double balance, String InstitutionName) {
        super(name, balance, 3000);
        this.InstitutionName = InstitutionName;
    }
}
