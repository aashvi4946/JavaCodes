package week4;

public class Student {
    // Attributes
    String name;
    int age;
    String regno;
    double cgpa;
    String address;

    // Constructor
    public Student(String name, int age, String regno, double cgpa, String address) {
        this.name = name;
        this.age = age;
        this.regno = regno;
        this.cgpa = cgpa;
        this.address = address;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + regno);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Address: " + address);
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Creating two instances of the Student class
        Student student1 = new Student("Alice", 20, "REG12345", 3.8, "123 Main St, Cityville");
        Student student2 = new Student("Bob", 21, "REG67890", 3.6, "456 Elm St, Townsville");

        // Printing the details of both students
        student1.printDetails();
        student2.printDetails();
    }
}

