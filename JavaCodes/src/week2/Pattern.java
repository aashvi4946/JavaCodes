package week2;

public class Pattern {
    public static void main(String[] args) {
        int rows = 5;  // You can change this value to print more or fewer rows

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for the number of columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

