package week5;

public class RotationalCheck {

    // Function to check if two strings are rotationally equivalent
    static boolean areRotationallyEqual(String str1, String str2) {
        // Check if both strings have the same length and are not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself and check if str2 is a substring of the result
        String combinedStr = str1 + str1;
        return combinedStr.contains(str2);
    }

    public static void main(String[] args) {
        String string1 = "srmist";
        String string2 = "tsrmis";

        System.out.println("String 1 is : " + string1);
        System.out.println("String 2 is : " + string2);

        // Check if the strings are rotationally equivalent
        boolean result = areRotationallyEqual(string1, string2);

        // Print the result
        System.out.println("Are two strings Rotationally equal ? : " + result);
    }
}

