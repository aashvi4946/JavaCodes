package week4;

// Base class BankAccount
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to check balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // in percentage

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interest = checkBalance() * (interestRate / 100);
        deposit(interest);
        System.out.println("Applied interest: $" + interest + " at rate: " + interestRate + "%");
    }

    // Method to display account details including interest rate
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account = new BankAccount("123456", "John Doe", 500.0);
        account.displayAccountDetails();
        account.deposit(200.0);
        account.withdraw(100.0);
        System.out.println("Current Balance: $" + account.checkBalance());
        System.out.println();

        // Create a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount("654321", "Jane Smith", 1000.0, 5.0);
        savingsAccount.displayAccountDetails();
        savingsAccount.applyInterest();
        System.out.println("Current Balance after interest: $" + savingsAccount.checkBalance());
    }
}



