package week6;

// Define the Flyable interface
interface Flyable {
    void fly_obj();
}

// Implement the Spacecraft class that implements Flyable
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The spacecraft is flying through space.");
    }
}

// Implement the Airplane class that implements Flyable
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The airplane is flying in the sky.");
    }
}

// Implement the Helicopter class that implements Flyable
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("The helicopter is hovering and flying above the ground.");
    }

    public static void main(String[] args) {
        // Create instances of each class
        Flyable spacecraft = new Spacecraft();
        Flyable airplane = new Airplane();
        Flyable helicopter = new Helicopter();

        // Call the fly_obj method for each instance
        spacecraft.fly_obj();
        airplane.fly_obj();
        helicopter.fly_obj();
    }
}


