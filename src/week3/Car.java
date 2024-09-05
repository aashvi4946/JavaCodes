package week3;

public class Car {
    // Attributes
    private String model;
    private int year;
    private String color;

    // Constructor
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Method to display car information
    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacture Year: " + year);
        System.out.println("Color: " + color);
    }
    public static void main(String[] args) {
        // Creating two Car objects
        Car car1 = new Car("Maruti Suzuki", 2020, "Red");
        Car car2 = new Car("Pagani", 2018, "Blue");

        // Displaying the information of the cars
        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
