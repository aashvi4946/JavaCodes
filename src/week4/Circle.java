package week4;

public class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to print circle details
    public void printDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        // Creating an instance of the Circle class
        Circle circle = new Circle(5.0);

        // Printing the initial details of the circle, including area and circumference
        System.out.println("Initial details:");
        circle.printDetails();

        // Modifying the radius of the circle using the setter method
        circle.setRadius(7.0);

        // Printing the updated details of the circle, including area and circumference
        System.out.println("Updated details:");
        circle.printDetails();
    }
}


