package week6;

// Base class Shape
public class Shape {
    // Method to calculate the perimeter (to be overridden)
    public double getPerimeter() {
        return 0.0;
    }

    // Method to calculate the area (to be overridden)
    public double getArea() {
        return 0.0;
    }
}

// Subclass Circle that extends Shape
 class Circle extends Shape {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the getPerimeter method to calculate the circumference of the circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override the getArea method to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create an instance of Circle with a specific radius
        Circle circle = new Circle(5.0);

        // Display the perimeter and area of the circle
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}



