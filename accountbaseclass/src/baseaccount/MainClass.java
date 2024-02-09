package baseaccount;

public class MainClass {
	public static void main(String[] args) {
        // Example usage
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5, 500);
        CurrentAccount currentAccount = new CurrentAccount(2000, 3, 1000);
        savingsAccount.calculateInterest();
        savingsAccount.displayBalance();
        savingsAccount.displayMinimumBalance();
        System.out.println();
        currentAccount.calculateInterest();
        currentAccount.displayBalance();
        currentAccount.displayOverdraftLimit();
    }
}
