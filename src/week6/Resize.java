package week6;

// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Implement the Rectangle class that implements Resizable
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor to initialize the width and height of the rectangle
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to resize the width of the rectangle
    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }

    // Method to resize the height of the rectangle
    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }

    // Method to display the dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Rectangle Dimensions: Width = " + width + ", Height = " + height);
    }

    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(10, 5);

        // Display initial dimensions
        rectangle.displayDimensions();

        // Resize the width and height
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);

        // Display dimensions after resizing
        rectangle.displayDimensions();

}
}


