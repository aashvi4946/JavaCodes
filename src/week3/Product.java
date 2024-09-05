package week3;

import java.util.ArrayList;

public class Product {
    // Attributes
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    // Attribute: List of Product objects
    private ArrayList<Product> items;

    // Constructor
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    // Method to remove a product from the cart
    public void removeProduct(Product product) {
        if (items.remove(product)) {
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            System.out.println(product.getName() + " not found in the cart.");
        }
    }

    // Method to calculate the total price of all items in the cart
    public double calculateTotal() {
        double total = 0.0;
        for (Product product : items) {
            total += product.getTotalPrice();
        }
        return total;
    }

    // Method to display all products in the cart
    public void displayCartItems() {
        System.out.println("Cart Items:");
        for (Product product : items) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " x " + product.getQuantity());
        }
        System.out.println("Total Price: $" + calculateTotal());
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99, 1);
        Product product2 = new Product("Smartphone", 499.99, 2);
        Product product3 = new Product("Headphones", 199.99, 1);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.displayCartItems();
        cart.removeProduct(product2);
        cart.displayCartItems();
    }
}
