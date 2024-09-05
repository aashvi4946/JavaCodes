package week6;

public class arithmetic {
    public static void main(String[] args) {
        Addition add = new Addition();
        Multiplication multiply = new Multiplication();

        int a = 5, b = 3;

        System.out.println("Addition of " + a + " and " + b + ": " + add.add(a, b));
        System.out.println("Multiplication of " + a + " and " + b + ": " + multiply.multiply(a, b));
    }
}

