package week3;

public class Rectangle {
    // Attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    public static void main(String[] args) {
        // Creating a Rectangle object
        Rectangle rect = new Rectangle(5.0, 3.0);

        // Calculating and printing the area and perimeter
        double area = rect.calculateArea();
        double perimeter = rect.calculatePerimeter();

        System.out.println("Rectangle Width: " + rect.width);
        System.out.println("Rectangle Height: " + rect.height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

