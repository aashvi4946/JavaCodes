package week5;

public class CheckValues {
    static boolean checkCondition(int a, int b) {
        if (a == b) {
            return true;
        }
        if ((a + b) == 5) {
            return true;
        }
        if (Math.abs(a - b) == 5) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        boolean result = checkCondition(num1, num2);
        System.out.println("Condition met: " + result);
    }
}

