package baseaccount;

public class SavingsAccount extends Account {
    private double minimumBalance;

    public SavingsAccount(double balance, double interest, double minimumBalance) {
        super(balance, interest);
        this.minimumBalance = minimumBalance;
    }

    @Override
    public void calculateInterest() {
        super.calculateInterest();
        System.out.println("Savings Account Interest added.");
    }

    public void displayMinimumBalance() {
        System.out.println("Minimum Balance for Savings Account: " + minimumBalance);
    }
}

// Derived class: CurrentAccount
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double balance, double interest, double overdraftLimit) {
        super(balance, interest);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void calculateInterest() {
        super.calculateInterest();
        System.out.println("Current Account Interest added.");
    }

    public void displayOverdraftLimit() {
        System.out.println("Overdraft Limit for Current Account: " + overdraftLimit);
    }
}


