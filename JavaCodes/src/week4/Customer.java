package week4;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Double> purchaseHistory;

    // Constructor
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    // Method to add a purchase to the history
    public void addPurchase(double amount) {
        if (amount > 0) {
            purchaseHistory.add(amount);
            System.out.println("Purchase added: $" + amount);
        } else {
            System.out.println("Purchase amount must be positive.");
        }
    }

    // Method to calculate total expenditure
    public double calculateTotalExpenditure() {
        double total = 0;
        for (double amount : purchaseHistory) {
            total += amount;
        }
        return total;
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Total Expenditure: $" + calculateTotalExpenditure());
    }
}

class LoyalCustomer extends Customer {
    private double discountRate; // in percentage

    // Constructor
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    // Method to apply discount to a purchase amount
    public void addDiscountedPurchase(double amount) {
        double discountedAmount = amount - (amount * (discountRate / 100));
        super.addPurchase(discountedAmount);
        System.out.println("Discount applied: " + discountRate + "%");
    }

    // Method to display customer details including discount rate
    @Override
    public void displayCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("Discount Rate: " + discountRate + "%");
    }

    public static void main(String[] args) {
        // Create a Customer instance
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        customer.addPurchase(200.0);
        customer.addPurchase(150.0);
        customer.displayCustomerDetails();
        System.out.println();

        // Create a LoyalCustomer instance
        LoyalCustomer loyalCustomer = new LoyalCustomer("Jane Smith", "jane.smith@example.com", 10.0);
        loyalCustomer.addDiscountedPurchase(300.0);
        loyalCustomer.addDiscountedPurchase(400.0);
        loyalCustomer.displayCustomerDetails();
    }
}

