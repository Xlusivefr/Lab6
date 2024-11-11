import java.text.DecimalFormat;

public class AccountDriver {
    public static void main(String[] args) {
        DecimalFormat myFormat = new DecimalFormat("#.00"); // Format currency to two decimal places

        // Create and test CheckingAccount
        CheckingAccount myCheckingAccount = new CheckingAccount("Benjamin Franklin", 1000);
        System.out.println("Account Number " + myCheckingAccount.getAccountNumber() + " belonging to " + myCheckingAccount.getOwner());
        System.out.println("Initial balance = $" + myFormat.format(myCheckingAccount.getBalance()));
        myCheckingAccount.deposit(500);
        System.out.println("After deposit of $500.00, balance = $" + myFormat.format(myCheckingAccount.getBalance()));
        myCheckingAccount.withdraw(1000);
        System.out.println("After withdrawal of $1000.00, balance = $" + myFormat.format(myCheckingAccount.getBalance()));
        System.out.println();

        // Create and test SavingsAccount
        SavingsAccount yourAccount = new SavingsAccount("William Shakespeare", 400);
        System.out.println("Account Number " + yourAccount.getAccountNumber() + " belonging to " + yourAccount.getOwner());
        System.out.println("Initial balance = $" + myFormat.format(yourAccount.getBalance()));
        yourAccount.deposit(500);
        System.out.println("After deposit of $500.00, balance = $" + myFormat.format(yourAccount.getBalance()));
        yourAccount.withdraw(1000);
        System.out.println("Insufficient funds to withdraw $1000.00, balance = $" + myFormat.format(yourAccount.getBalance()));
        yourAccount.applyInterest();
        System.out.println("After monthly interest has been posted, balance = $" + myFormat.format(yourAccount.getBalance()));
        System.out.println();

        // Test copy constructor of SavingsAccount
        SavingsAccount secondAccount = new SavingsAccount(yourAccount, 5);
        System.out.println("Account Number " + secondAccount.getAccountNumber() + " belonging to " + secondAccount.getOwner());
        System.out.println("Initial balance = $" + myFormat.format(secondAccount.getBalance()));
        secondAccount.deposit(500);
        System.out.println("After deposit of $500.00, balance = $" + myFormat.format(secondAccount.getBalance()));
        secondAccount.withdraw(1000);
        System.out.println("Insufficient funds to withdraw $1000.00, balance = $" + myFormat.format(secondAccount.getBalance()));
        System.out.println();

        // Test a new CheckingAccount
        CheckingAccount yourCheckingAccount = new CheckingAccount("Isaac Newton", 5000);
        System.out.println("Account Number " + yourCheckingAccount.getAccountNumber() + " belonging to " + yourCheckingAccount.getOwner());
    }
}
