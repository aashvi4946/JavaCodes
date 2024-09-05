package week2;

public class OddNumbers {
    public static void main(String[] args) {
        int givenNumber = 20;  
        for (int i = 1; i <= givenNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

