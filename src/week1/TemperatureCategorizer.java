package week1;

import java.util.Scanner;

public class TemperatureCategorizer {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the current temperature
        System.out.print("Please enter the current temperature in degrees Celsius: ");
        double temperature = scanner.nextDouble();

        // Categorize the temperature using if statements
        if (temperature > 30) {
            System.out.println("It's hot!");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("It's warm.");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's cold.");
        }

        // Close the scanner
        scanner.close();
    }
}

