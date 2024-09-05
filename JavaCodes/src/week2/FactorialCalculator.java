package week2;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int factorial = 1;
            int i = 1;

            // Do-while loop to calculate the factorial
            do {
                factorial *= i;
                i++;
            } while (i <= number);

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        
        scanner.close();
    }
}

