package week7;

// Abstract class Animal
abstract class Animal {
    // Abstract method for making sound
    public abstract void makeSound();

    // Abstract method for eating
    public abstract void eat();
}

// Dog class inheriting from Animal
class Dog extends Animal {
    // Implementing the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }

    // Implementing the eat method
    @Override
    public void eat() {
        System.out.println("Dog is eating dog food.");
    }
}

// Cat class inheriting from Animal
class Cat extends Animal {
    // Implementing the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }

    // Implementing the eat method
    @Override
    public void eat() {
        System.out.println("Cat is eating cat food.");
    }
}

// Bird class inheriting from Animal
class Bird extends Animal {
    // Implementing the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp Chirp");
    }

    // Implementing the eat method
    @Override
    public void eat() {
        System.out.println("Bird is eating seeds.");
    }

    public static void main(String[] args) {
        // Creating instances of Dog, Cat, and Bird
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        // Calling methods on each instance
        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();

        bird.makeSound();
        bird.eat();
    }
}



