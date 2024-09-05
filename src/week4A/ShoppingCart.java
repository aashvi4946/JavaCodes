package week4A;

import java.util.Arrays;
import java.util.Random;

public class ShoppingCart {
    public static void main(String[] args) {
        double[] cart = new double[10];
        Random rand = new Random();
        for (int i = 0; i < cart.length; i++) {
            cart[i] = rand.nextDouble() * 100;
        }
        System.out.println("Cart prices: " + Arrays.toString(cart));
        cart[2] = 0;
        System.out.println("Cart after removing item at index 2: " + Arrays.toString(cart));
        double totalPrice = 0;
        for (double price : cart) {
            totalPrice += price;
        }
        System.out.println("Total price of items in the cart: $" + totalPrice);
        findMostAndLeastExpensive(cart);
    }

    public static void findMostAndLeastExpensive(double[] cart) {
        double mostExpensive = 0;
        double leastExpensive = Double.MAX_VALUE;

        for (double price : cart) {
            if (price > mostExpensive) {
                mostExpensive = price;
            }
            if (price < leastExpensive && price > 0) {
                leastExpensive = price;
            }
        }

        System.out.println("Most expensive item in the cart: $" + mostExpensive);
        System.out.println("Least expensive item in the cart: $" + leastExpensive);
    }
}
