
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingCharacterFinder {
    public static Character findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (charFrequency.containsKey(ch)) {
                charFrequency.put(ch, charFrequency.get(ch) + 1);
            } else {
                charFrequency.put(ch, 1);
            }
        }

        for (char ch : str.toCharArray()) {
            if (charFrequency.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        Character firstNonRepeatingChar = findFirstNonRepeatingCharacter(str);

        if (firstNonRepeatingChar != null) {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating characters found.");
        }

        scanner.close();
    }
}
