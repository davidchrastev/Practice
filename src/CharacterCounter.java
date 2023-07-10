import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void countCharacters(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (charCounts.containsKey(ch)) {
                charCounts.put(ch, charCounts.get(ch) + 1);
            } else {
                charCounts.put(ch, 1);
            }
        }

        // Display the character counts
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        countCharacters(str);

        scanner.close();
    }
}
