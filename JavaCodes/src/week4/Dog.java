package week4;

public class Dog {
    // Attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to print dog details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println();
    }
     public static void main(String[] args) {
        // Creating two instances of the Dog class
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Printing initial details of both dogs
        System.out.println("Initial details:");
        dog1.printDetails();
        dog2.printDetails();

        // Modifying the attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador Retriever");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        // Printing updated details of both dogs
        System.out.println("Updated details:");
        dog1.printDetails();
        dog2.printDetails();
     }
}

