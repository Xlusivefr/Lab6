public class SavingsAccount extends BankAccount {
    private double interestRate = 0.025;  // Changed 'rate' to 'interestRate'
    private int accountSuffix = 0;        // Changed 'savingsNumber' to 'accountSuffix'
    private String accountIdentifier;     // Renamed 'accountNumber' to 'accountIdentifier'

    // Constructor: Sets up the savings account with an initial balance and account number
    public SavingsAccount(String accountHolder, double startingBalance) {
        super(accountHolder, startingBalance);  // Call to superclass constructor
        // Constructing the unique account number with the suffix
        accountIdentifier = super.getAccountNumber() + "-" + accountSuffix;
        accountSuffix++;  // Increment suffix for the next savings account
    }

    // Copy Constructor: Creates a new savings account based on another existing one
    public SavingsAccount(SavingsAccount originalAccount, double newBalance) {
        super(originalAccount, newBalance);  // Call to superclass copy constructor
        accountSuffix++;  // Increment suffix number for the new account
        accountIdentifier = super.getAccountNumber() + "-" + accountSuffix;
    }

    // Method to add interest to the account's balance
    public void applyInterest() {
        double monthlyInterestRate = interestRate / 12;  // Convert annual rate to monthly
        double interest = super.getBalance() * monthlyInterestRate;
        super.deposit(interest);  // Deposit interest to the balance
    }

    // Overridden method to return the correct account number, now with suffix
    @Override
    public String getAccountNumber() {
        return accountIdentifier;  // Return the account number with suffix
    }
}

