package week4;

import java.util.ArrayList;

 public class MenuItem {
    private String name;
    private double price;
    private double rating;

    public MenuItem(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public void printDetails() {
        System.out.println("Item: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Rating: " + rating + " stars");
    }
}

class Restaurant {
    private ArrayList<MenuItem> menuItems;

    public Restaurant() {
        menuItems = new ArrayList<>();
    }

    // Method to add a menu item
    public void addItem(String name, double price, double rating) {
        MenuItem newItem = new MenuItem(name, price, rating);
        menuItems.add(newItem);
        System.out.println("Added item: " + name);
    }

    // Method to remove a menu item by name
    public void removeItem(String name) {
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).getName().equals(name)) {
                System.out.println("Removed item: " + name);
                menuItems.remove(i);
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    // Method to calculate the average rating of the restaurant
    public double calculateAverageRating() {
        if (menuItems.isEmpty()) {
            return 0.0;
        }
        double totalRating = 0;
        for (MenuItem item : menuItems) {
            totalRating += item.getRating();
        }
        return totalRating / menuItems.size();
    }

    // Method to print all menu items
    public void printMenu() {
        if (menuItems.isEmpty()) {
            System.out.println("No items on the menu.");
        } else {
            System.out.println("Menu:");
            for (MenuItem item : menuItems) {
                item.printDetails();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of Restaurant
        Restaurant restaurant = new Restaurant();

        // Add items to the restaurant's menu
        restaurant.addItem("Burger", 5.99, 4.5);
        restaurant.addItem("Pizza", 8.99, 4.7);
        restaurant.addItem("Pasta", 7.99, 4.2);

        // Print the menu
        restaurant.printMenu();

        // Remove an item from the menu
        restaurant.removeItem("Pizza");

        // Print the menu again
        restaurant.printMenu();

        // Calculate and print the average rating
        double averageRating = restaurant.calculateAverageRating();
        System.out.println("Average Rating: " + averageRating + " stars");
    }
}



