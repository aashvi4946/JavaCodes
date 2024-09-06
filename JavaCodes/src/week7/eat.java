package week7;

// Base class Animal
class Animal {
    // Attributes
    private String name;
    private String sound;
    private int num_legs;

    // Constructor to initialize Animal attributes
    public Animal(String name, String sound, int num_legs) {
        this.name = name;
        this.sound = sound;
        this.num_legs = num_legs;
    }

    // Method to make the animal sound
    public void make_sound() {
        System.out.println(name + " makes sound: " + sound);
    }

    // Method to walk
    public void walk() {
        System.out.println(name + " walks on " + num_legs + " legs.");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Constructor for Dog
    public Dog() {
        super("Dog", "Bark", 4);
    }

    // Override make_sound() for Dog
    @Override
    public void make_sound() {
        System.out.println("The dog barks.");
    }

    // Override walk() for Dog
    @Override
    public void walk() {
        System.out.println("The dog walks energetically on 4 legs.");
    }
}

// Derived class Cat
class Cat extends Animal {
    // Constructor for Cat
    public Cat() {
        super("Cat", "Meow", 4);
    }

    // Override make_sound() for Cat
    @Override
    public void make_sound() {
        System.out.println("The cat meows.");
    }

    // Override walk() for Cat
    @Override
    public void walk() {
        System.out.println("The cat walks gracefully on 4 legs.");
    }
}

// Derived class Bird
class Bird extends Animal {
    // Constructor for Bird
    public Bird() {
        super("Bird", "Chirp", 2);
    }

    // Override make_sound() for Bird
    @Override
    public void make_sound() {
        System.out.println("The bird chirps.");
    }

    // Override walk() for Bird
    @Override
    public void walk() {
        System.out.println("The bird hops on 2 legs.");
    }

    // Additional method for Bird
    public void fly() {
        System.out.println("The bird flies in the sky.");
    }

    public static void main(String[] args) {
        // Create objects of Dog, Cat, and Bird
        Animal dog = new Dog();
        Animal cat = new Cat();
        Bird bird = new Bird();  // Use Bird object directly since it has additional methods

        // Demonstrate behavior for Dog
        System.out.println("Dog:");
        dog.make_sound();
        dog.walk();
        System.out.println();

        // Demonstrate behavior for Cat
        System.out.println("Cat:");
        cat.make_sound();
        cat.walk();
        System.out.println();

        // Demonstrate behavior for Bird
        System.out.println("Bird:");
        bird.make_sound();
        bird.walk();
        bird.fly();  // Bird has an additional method fly()
    }
}

