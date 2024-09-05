package week5;

public class Main {
    public static void printCombinations(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    System.out.println(digits[i] + " " + digits[j] + " " + digits[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        printCombinations(digits);
    }
}

