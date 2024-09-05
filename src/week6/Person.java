package week6;

public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to create instances and display their information
    public static void main(String[] args) {
        // Creating two instances of the Person class
        Person person1 = new Person("Aashvi", 20);
        Person person2 = new Person("Sudhir", 25);

        // Displaying the information of both persons
        person1.displayInfo();
        person2.displayInfo();
    }
}

