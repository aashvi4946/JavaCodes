package week7;

// Base class Vehicle
class Vehicle {
    // Attributes of Vehicle
    private String make;
    private String model;
    private int year;
    private int num_wheels;

    // Constructor for Vehicle
    public Vehicle(String make, String model, int year, int num_wheels) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.num_wheels = num_wheels;
    }

    // Method to display vehicle details
    public void displayVehicleInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Wheels: " + num_wheels);
    }
}

// Interface Engine to simulate multiple inheritance
interface Engine {
    // Attributes of Engine (as methods to simulate fields)
    String getEngineType();
    int getHorsepower();
    String getFuelType();

    // Method to display engine details
    default void displayEngineInfo() {
        System.out.println("Engine Type: " + getEngineType());
        System.out.println("Horsepower: " + getHorsepower());
        System.out.println("Fuel Type: " + getFuelType());
    }
}

// Derived class Car that inherits from Vehicle and implements Engine
class Car extends Vehicle implements Engine {
    // Specific attribute for Car
    private int num_doors;

    // Constructor for Car
    public Car(String make, String model, int year, int num_wheels, int num_doors) {
        super(make, model, year, num_wheels);
        this.num_doors = num_doors;
    }

    // Method to display specific Car details
    public void displayCarInfo() {
        displayVehicleInfo();
        System.out.println("Number of Doors: " + num_doors);
        displayEngineInfo(); // Display engine details
    }

    // Implementing methods from Engine interface
    @Override
    public String getEngineType() {
        return "V6";
    }

    @Override
    public int getHorsepower() {
        return 300;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }
}

// Derived class Truck that inherits from Vehicle and implements Engine
class Truck extends Vehicle implements Engine {
    // Specific attribute for Truck
    private double load_capacity;

    // Constructor for Truck
    public Truck(String make, String model, int year, int num_wheels, double load_capacity) {
        super(make, model, year, num_wheels);
        this.load_capacity = load_capacity;
    }

    // Method to display specific Truck details
    public void displayTruckInfo() {
        displayVehicleInfo();
        System.out.println("Load Capacity: " + load_capacity + " tons");
        displayEngineInfo(); // Display engine details
    }

    // Implementing methods from Engine interface
    @Override
    public String getEngineType() {
        return "V8";
    }

    @Override
    public int getHorsepower() {
        return 400;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }
}

// Derived class Motorcycle that inherits from Vehicle and implements Engine
class Motorcycle extends Vehicle implements Engine {
    // Specific attribute for Motorcycle
    private boolean has_sidecar;

    // Constructor for Motorcycle
    public Motorcycle(String make, String model, int year, int num_wheels, boolean has_sidecar) {
        super(make, model, year, num_wheels);
        this.has_sidecar = has_sidecar;
    }

    // Method to display specific Motorcycle details
    public void displayMotorcycleInfo() {
        displayVehicleInfo();
        System.out.println("Has Sidecar: " + (has_sidecar ? "Yes" : "No"));
        displayEngineInfo(); // Display engine details
    }

    // Implementing methods from Engine interface
    @Override
    public String getEngineType() {
        return "Inline-4";
    }

    @Override
    public int getHorsepower() {
        return 200;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }

    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2022, 4, 4);
        System.out.println("Car Info:");
        car.displayCarInfo();
        System.out.println();

        // Create a Truck object
        Truck truck = new Truck("Ford", "F-150", 2023, 4, 1.5);
        System.out.println("Truck Info:");
        truck.displayTruckInfo();
        System.out.println();

        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Sportster", 2021, 2, false);
        System.out.println("Motorcycle Info:");
        motorcycle.displayMotorcycleInfo();
    }
}


