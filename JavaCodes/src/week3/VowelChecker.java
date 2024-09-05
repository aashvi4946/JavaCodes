package week3;

public class VowelChecker {
    public static void main(String[] args) {
        String input = "aeiou"; 

        if (areAllCharactersVowels(input)) {
            System.out.println("All characters are vowels.");
        } else {
            System.out.println("Not all characters are vowels.");
        }
    }

    public static boolean areAllCharactersVowels(String str) {
        String vowels = "aeiou";
        if (str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(Character.toLowerCase(c)) == -1) {
                return false; 
            }
        }
        return true;
    }
}

