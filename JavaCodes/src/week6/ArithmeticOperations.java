package week6;

public class ArithmeticOperations {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to subtract two double values
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply two double values
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Method to divide two double values
    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        ArithmeticOperations operations = new ArithmeticOperations();

        // Test addition
        System.out.println("Addition of two integers: " + operations.add(5, 3));
        System.out.println("Addition of three integers: " + operations.add(5, 3, 2));
        System.out.println("Addition of two doubles: " + operations.add(5.5, 3.2));

        // Test subtraction
        System.out.println("Subtraction of two integers: " + operations.subtract(10, 4));
        System.out.println("Subtraction of two doubles: " + operations.subtract(10.5, 4.3));

        // Test multiplication
        System.out.println("Multiplication of two integers: " + operations.multiply(4, 3));
        System.out.println("Multiplication of three integers: " + operations.multiply(4, 3, 2));
        System.out.println("Multiplication of two doubles: " + operations.multiply(4.5, 3.2));

        // Test division
        System.out.println("Division of two integers: " + operations.divide(20, 4));
        System.out.println("Division of two doubles: " + operations.divide(20.5, 4.1));
    }
}

