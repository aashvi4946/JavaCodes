package week5;

import java.util.HashMap;
import java.util.Map;
public class CharacterCount {
    static void countCharacters(String text) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            if (characterCountMap.containsKey(ch)) {
                characterCountMap.put(ch, characterCountMap.get(ch) + 1);
            } else {
                characterCountMap.put(ch, 1);
            }
        }
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        String text = "hello world";
        countCharacters(text);
    }
}

