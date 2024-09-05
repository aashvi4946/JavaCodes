package week2;

public class PowersOfTwo {
    public static void main(String[] args) {
        int exponent = 5;  // You can change this value to any exponent
        int i = 0;  // Start from exponent 0
        int result = 1;  // 2^0 is 1

        // Do-while loop to print powers of 2
        do {
            System.out.println("2^" + i + " = " + result);
            i++;
            result *= 2;  // Compute the next power of 2
        } while (i <= exponent);
    }
}

