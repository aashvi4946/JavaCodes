package week7;

// ArithmeticOperations.java

public class ArithmeticOperations {

    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Main method to test the operations
    public static void main(String[] args) {
        ArithmeticOperations arithmetic = new ArithmeticOperations();

        // Test values
        double num1 = 12.5;
        double num2 = 3.5;

        // Performing arithmetic operations
        System.out.println("Addition: " + arithmetic.add(num1, num2));
        System.out.println("Subtraction: " + arithmetic.subtract(num1, num2));
        System.out.println("Multiplication: " + arithmetic.multiply(num1, num2));
        System.out.println("Division: " + arithmetic.divide(num1, num2));
    }
}

