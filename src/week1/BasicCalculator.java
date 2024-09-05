package week1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Display message with options
        System.out.println("Enter 1 for addition or 2 for subtraction.");

        // Ask the user for their choice
        System.out.print("Please enter your choice: ");
        int choice = scanner.nextInt();

        // Check the choice and perform the corresponding operation
        if (choice == 1) {
            // Ask for two numbers for addition
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Calculate and print the sum
            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } else if (choice == 2) {
            // Ask for two numbers for subtraction
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Calculate and print the difference
            double difference = num1 - num2;
            System.out.println("The difference is: " + difference);
        } else {
            // Handle invalid choices
            System.out.println("Invalid choice.");
        }

        // Close the scanner
        scanner.close();
    }
}

