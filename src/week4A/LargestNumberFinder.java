package week4A;

import java.util.Random;

public class LargestNumberFinder {
    public static void main(String[] args) {
        int size = 10;
        int range = 100;
        int[] numbers = fillArray(size, range);
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        int largestNumber = findLargest(numbers);
        System.out.println("The largest number in the array is: " + largestNumber);
    }
    public static int[] fillArray(int size, int range) {
        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(range + 1);
        }
        return numbers;
    }
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }
}

