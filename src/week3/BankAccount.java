package week3;

public class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to display account balance
    public void displayBalance() {
        System.out.println("Final Balance: $" + balance);
    }

    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Alice Smith", 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.displayBalance();
    }
}

