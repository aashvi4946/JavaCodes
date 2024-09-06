package week7;

// BankAccount.java

public class BankAccount {
    // Private attributes
    private String accountNumber;
    private double balance;
    private static final double MINIMUM_BALANCE = 0.0; // Constant for minimum balance allowed

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= MINIMUM_BALANCE) {
            this.balance = initialBalance;
        } else {
            this.balance = MINIMUM_BALANCE; // Setting to minimum balance if initial is below 0
        }
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
    public static void main(String[] args) {
        // Creating a new BankAccount with an initial balance
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Testing account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit test
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw test
        account.withdraw(300.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempting to withdraw more than the balance
        account.withdraw(1500.0);
        System.out.println("Balance after attempted overdraw: " + account.getBalance());

        // Testing invalid withdrawal
        account.withdraw(-100.0);

        // Testing invalid deposit
        account.deposit(-50.0);
    }

    // Main method to test the functionality
    
}

