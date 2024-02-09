package baseaccount;

public class Account {
    protected double balance;
    protected double interest;

    public Account(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double calculatedInterest = balance * interest / 100;
        balance += calculatedInterest;
        System.out.println("Interest calculated: " + calculatedInterest);
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}


