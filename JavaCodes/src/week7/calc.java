package week7;

// Base class Calculator
class Calculator {
    // Method to perform addition
    public double calculate(double a, double b) {
        return a + b;
    }
}

// Subclass SubtractionCalculator
class SubtractionCalculator extends Calculator {
    // Overriding calculate method to perform subtraction
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

// Subclass MultiplicationCalculator
class MultiplicationCalculator extends Calculator {
    // Overriding calculate method to perform multiplication
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

// Subclass DivisionCalculator
class DivisionCalculator extends Calculator {
    // Overriding calculate method to perform division
    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create objects for each calculator type
        Calculator addCalc = new Calculator();
        Calculator subCalc = new SubtractionCalculator();
        Calculator mulCalc = new MultiplicationCalculator();
        Calculator divCalc = new DivisionCalculator();

        // Test the calculators
        System.out.println("Addition: " + addCalc.calculate(10.5, 5.5));
        System.out.println("Subtraction: " + subCalc.calculate(10.5, 5.5));
        System.out.println("Multiplication: " + mulCalc.calculate(10.5, 5.5));
        System.out.println("Division: " + divCalc.calculate(10.5, 5.5));
        System.out.println("Division by zero: " + divCalc.calculate(10.5, 0));
    }
}


