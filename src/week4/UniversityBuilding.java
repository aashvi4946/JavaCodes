package week4;

public class UniversityBuilding {
    private String address;
    private int numberOfFloors;
    private double totalArea; // in square meters

    // Constructor
    public UniversityBuilding(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

    // Getter methods
    public String getAddress() {
        return address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    // Method to display building details
    public void displayBuildingDetails() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq.m.");
    }
}

// Subclass ResidentialBuilding
class ResidentialBuilding extends UniversityBuilding {
    private int numberOfApartments;
    private double rentPerApartment; // per month

    // Constructor
    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }

    // Method to calculate total rent
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }

    // Method to display building details including residential attributes
    @Override
    public void displayBuildingDetails() {
        super.displayBuildingDetails();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: $" + rentPerApartment);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}

// Subclass CommercialBuilding
class CommercialBuilding extends UniversityBuilding {
    private double officeSpaceArea; // in square meters
    private double rentPerSquareMeter; // per month

    // Constructor
    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpaceArea, double rentPerSquareMeter) {
        super(address, numberOfFloors, totalArea);
        this.officeSpaceArea = officeSpaceArea;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }

    // Method to calculate total rent
    public double calculateTotalRent() {
        return officeSpaceArea * rentPerSquareMeter;
    }

    // Method to display building details including commercial attributes
    @Override
    public void displayBuildingDetails() {
        super.displayBuildingDetails();
        System.out.println("Office Space Area: " + officeSpaceArea + " sq.m.");
        System.out.println("Rent per Square Meter: $" + rentPerSquareMeter);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }

    public static void main(String[] args) {
        // Create a ResidentialBuilding instance
        ResidentialBuilding residentialBuilding = new ResidentialBuilding(
            "123 University Ave", 10, 5000.0, 50, 1200.0
        );
        residentialBuilding.displayBuildingDetails();
        System.out.println();

        // Create a CommercialBuilding instance
        CommercialBuilding commercialBuilding = new CommercialBuilding(
            "456 Business St", 15, 10000.0, 6000.0, 50.0
        );
        commercialBuilding.displayBuildingDetails();
    }
}



