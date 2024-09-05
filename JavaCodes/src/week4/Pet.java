package week4;

// Base class Pet
public class Pet {
    private String name;
    private String species;
    private int age; // age in years

    // Constructor
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    // Method to display pet details
    public void displayPetDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    // Method to calculate age in human years (basic approximation)
    public int calculateHumanYears() {
        return age * 7; // simple approximation
    }
}

// Subclass Dog
class Dog extends Pet {
    private String favoriteToy;

    // Constructor
    public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

    // Getter method
    public String getFavoriteToy() {
        return favoriteToy;
    }

    // Method to display dog details
    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
    }

    // Method to calculate age in human years (specific for dogs)
    @Override
    public int calculateHumanYears() {
        int dogAge = getAge();
        if (dogAge <= 2) {
            return (int) (dogAge * 10.5); // first 2 years
        } else {
            return 21 + (dogAge - 2) * 4; // after 2 years
        }
    }
}

// Subclass Bird
class Bird extends Pet {
    private double wingSpan; // in centimeters

    // Constructor
    public Bird(String name, int age, double wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }

    // Getter method
    public double getWingSpan() {
        return wingSpan;
    }

    // Method to display bird details
    @Override
    public void displayPetDetails() {
        super.displayPetDetails();
        System.out.println("Wing Span: " + wingSpan + " cm");
    }

    // Method to calculate age in human years (basic approximation)
    @Override
    public int calculateHumanYears() {
        return getAge() * 5; // simple approximation
    }

    public static void main(String[] args) {
        // Create a Dog instance
        Dog dog = new Dog("Buddy", 3, "Ball");
        dog.displayPetDetails();
        System.out.println("Age in Human Years: " + dog.calculateHumanYears() + " years");
        System.out.println();

        // Create a Bird instance
        Bird bird = new Bird("Tweety", 2, 25.0);
        bird.displayPetDetails();
        System.out.println("Age in Human Years: " + bird.calculateHumanYears() + " years");
    }
}



