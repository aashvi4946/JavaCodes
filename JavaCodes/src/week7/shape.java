package week7;

// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double calculateArea();

    // Abstract method to calculate perimeter
    public abstract double calculatePerimeter();
}

// Subclass Circle that inherits from Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea method for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing calculatePerimeter method for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Rectangle that inherits from Shape
class Rectangle extends Shape {
    private double length, width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementing calculatePerimeter method for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Subclass Triangle that inherits from Shape
class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor for Triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing calculateArea method for Triangle (Heron's formula)
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementing calculatePerimeter method for Triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        // Create Circle, Rectangle, and Triangle objects
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 4.0, 5.0);

        // Display area and perimeter for Circle
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Display area and perimeter for Rectangle
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Display area and perimeter for Triangle
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}



