package week3;

public class Person {
    // Attributes
    private String name;
    private int age;
    private String address;
    
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Available";
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice Johnson", 30, "123 Main St, Anytown, USA");
        person1.displayPersonInfo();
        person2.displayPersonInfo();
    }
}
