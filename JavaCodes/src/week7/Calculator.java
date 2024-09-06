package week7;

// Calculator.java

public class Calculator {

    // Method to perform addition on two integers
    public int calculate(int a, int b) {
        return a + b;
    }

    // Method to perform addition on two doubles
    public double calculate(double a, double b) {
        return a + b;
    }

    // Method to perform arithmetic operation based on a char ('+', '-', '*', '/')
    public int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return 0;
                }
            default:
                System.out.println("Invalid operator.");
                return 0;
        }
    }

    // Method to perform arithmetic operation based on a char ('+', '-', '*', '/') for doubles
    public double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return 0;
                }
            default:
                System.out.println("Invalid operator.");
                return 0;
        }
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test addition with integers
        System.out.println("Addition (int, int): " + calc.calculate(5, 3));

        // Test addition with doubles
        System.out.println("Addition (double, double): " + calc.calculate(5.5, 3.3));

        // Test arithmetic with integers and operator
        System.out.println("Subtraction (int, int, '-'): " + calc.calculate(10, 4, '-'));
        System.out.println("Multiplication (int, int, '*'): " + calc.calculate(6, 7, '*'));
        System.out.println("Division (int, int, '/'): " + calc.calculate(15, 3, '/'));

        // Test arithmetic with doubles and operator
        System.out.println("Division (double, double, '/'): " + calc.calculate(9.0, 2.0, '/'));
    }
}

