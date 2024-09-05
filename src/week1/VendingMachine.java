package week1;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Display message with options
        System.out.println("Press 1 for juice or 2 for soda.");

        // Ask the user for their choice
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();

        // Check the choice and print the corresponding message
        if (choice == 1) {
            System.out.println("Dispensing juice.");
        } else if (choice == 2) {
            System.out.println("Dispensing soda.");
        } else {
            System.out.println("Invalid choice.");
        }

        // Close the scanner
        scanner.close();
    }
}
