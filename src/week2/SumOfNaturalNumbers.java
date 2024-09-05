package week2;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int givenNumber = 10;  // You can change this value to any number
        int sum = 0;
        int i = 1;

        // While loop
        while (i <= givenNumber) {
            sum += i;
            i++;
        }

        // Print the result
        System.out.println("The sum of natural numbers from 1 to " + givenNumber + " is " + sum);
    }
}

