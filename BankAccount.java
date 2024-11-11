public abstract class BankAccount {
    protected static int numberOfAccounts = 100001; // Static variable to create unique account numbers

    private double balance;  // Account balance
    private String owner;    // Account owner's name
    private String accountNumber; // Account number

    // Default constructor
    public BankAccount() {
        balance = 0;
        accountNumber = numberOfAccounts + "";
        numberOfAccounts++;
    }

    // Standard constructor
    public BankAccount(String name, double amount) {
        owner = name;
        balance = amount;
        accountNumber = numberOfAccounts + "";
        numberOfAccounts++;
    }

    // Copy constructor
    public BankAccount(BankAccount oldAccount, double amount) {
        owner = oldAccount.owner;
        balance = amount;
        accountNumber = oldAccount.accountNumber;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        boolean completed = true;
        if (amount <= balance) {
            balance -= amount;
        } else {
            completed = false;
        }
        return completed;
    }

    // Getter methods
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter methods
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAccountNumber(String newAccountNumber) {
        accountNumber = newAccountNumber;
    }
}

