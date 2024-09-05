package week2;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter numbers to calculate the average (enter a negative number to stop):");

        // While loop to accept user input
        while (true) {
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
            count++;
        }

        // Calculate the average
        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        }
        
        scanner.close();
    }
}
