package week6;

public class TrafficLight {
    // Attributes
    private String color;
    private int duration;

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equals("Red") || color.equals("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equals("Green") || color.equals("green");
    }

    // Method to display the current state of the traffic light
    public void displayState() {
        System.out.println("Traffic Light Color: " + color + ", Duration: " + duration + " seconds");
    }

    // Main method to test the TrafficLight class
    public static void main(String[] args) {
        // Create a TrafficLight instance with initial color and duration
        TrafficLight light = new TrafficLight("Red", 30);

        // Display the initial state of the traffic light
        light.displayState();

        // Check if the light is red
        if (light.isRed()) {
            System.out.println("The light is red. Stop!");
        }

        // Change the color to green
        light.changeColor("Green");
        light.displayState();

        // Check if the light is green
        if (light.isGreen()) {
            System.out.println("The light is green. Go!");
        }
    }
}

