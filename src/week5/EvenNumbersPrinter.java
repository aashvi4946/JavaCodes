package week5;

import java.util.List;
public class EvenNumbersPrinter {
    static void printEvenNumbers(List<Integer> numbers) {
        System.out.println("Even numbers in the list:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printEvenNumbers(numberList);
    }
}

