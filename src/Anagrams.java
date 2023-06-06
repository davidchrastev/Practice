import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

    public static List<String> findAnagrams(String word, List<String> candidates) {
        List<String> result = new ArrayList<>();

        for (String currentWord : candidates) {
            if (isItAnagram(currentWord, word)) {
                result.add(currentWord);
            }
        }

        return result;

    }

    public static boolean isItAnagram(String currentWord, String targetWord) {

        if (currentWord.length() != targetWord.length()) {
            return false;
        }

        Map<Character, Integer> targetWordMap = new HashMap<>();
        Map<Character, Integer> currentWordMap = new HashMap<>();

        for (int i = 0; i < currentWord.length(); i++) {
            char targetChar = targetWord.charAt(i);
            char currentChar = currentWord.charAt(i);

            targetWordMap.put(targetChar, targetWordMap.getOrDefault(targetChar, 0) + 1);
            currentWordMap.put(currentChar, currentWordMap.getOrDefault(currentChar, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : targetWordMap.entrySet()) {
            char character = entry.getKey();
            int targetFrequency = entry.getValue();
            int currentFrequency = currentWordMap.getOrDefault(character, 0);

            if (targetFrequency != currentFrequency) {
                return false;
            }
        }

        return true;
    }
}
