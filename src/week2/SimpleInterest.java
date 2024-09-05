package week2;

public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1000;  
        double rate = 5;  
        int years = 3;  
        for (int i = 1; i <= years; i++) {
            double interest = principal * rate * i / 100;
            System.out.println("Year " + i + ": Simple Interest = " + interest);
        }
    }
}

