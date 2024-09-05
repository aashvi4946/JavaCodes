package week3;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;  // You can change this value to any integer

        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits in " + number + " is " + sum);
    }
    public static int sumOfDigits(int number) {
        // Handle negative numbers by taking the absolute value
        number = Math.abs(number);
        
        int sum = 0;
        while (number > 0) {
            sum += number % 10;  
            number /= 10;        
        }

        return sum;
    }
}

