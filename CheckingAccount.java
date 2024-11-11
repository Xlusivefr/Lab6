public class CheckingAccount extends BankAccount {
    public static final double FEE = 0.15; // Fee for clearing a check (15 cents)

    // Constructor for CheckingAccount
    public CheckingAccount(String name, double amount) {
        super(name, amount);  // Call the constructor of BankAccount
        setAccountNumber(getAccountNumber() + "-10");  // Append "-10" to the account number for checking accounts
    }

    // Override the withdraw method to add the fee
    @Override
    public boolean withdraw(double amount) {
        double totalAmount = amount + FEE;  // Add fee to withdrawal amount
        return super.withdraw(totalAmount);  // Call the superclass method to withdraw the amount
    }
}
