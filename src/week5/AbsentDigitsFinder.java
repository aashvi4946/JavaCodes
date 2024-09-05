package week5;

import java.util.HashSet;
import java.util.Set;

public class AbsentDigitsFinder {
    static String findAbsentDigits(String mobileNumber) {
        Set<Character> foundDigits = new HashSet<>();
        for (char ch : mobileNumber.toCharArray()) {
            if (Character.isDigit(ch)) {
                foundDigits.add(ch);  
            }
        }
        Set<Character> allDigits = new HashSet<>();
        for (char ch = '0'; ch <= '9'; ch++) {
            allDigits.add(ch);
        }
        allDigits.removeAll(foundDigits);
        StringBuilder absentDigits = new StringBuilder();
        for (char ch : allDigits) {
            absentDigits.append(ch).append(" ");
        }
        return absentDigits.toString().trim();
    }
    public static void main(String[] args) {
        String mobileNumber = "123456789";
        String absentDigits = findAbsentDigits(mobileNumber);
        System.out.println("Absent digits in the mobile number: " + absentDigits);
    }
}
