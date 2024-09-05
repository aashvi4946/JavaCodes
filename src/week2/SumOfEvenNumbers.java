package week2;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int givenNumber = 10;  // You can change this value to any number
        int sum = 0;
        int i = 1;  // Start from 1

        // Do-while loop to find the sum of even numbers
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= givenNumber);

        // Print the result
        System.out.println("The sum of even numbers from 1 to " + givenNumber + " is " + sum);
    }
}

