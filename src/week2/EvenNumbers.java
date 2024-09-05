package week2;

public class EvenNumbers {
    public static void main(String[] args) {
        int givenNumber = 20;  // You can change this value to any number

        // Traditional for loop
        for (int i = 1; i <= givenNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

