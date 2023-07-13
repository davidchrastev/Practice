import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charFrequencies = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charFrequencies.put(ch, charFrequencies.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charFrequencies.get(ch) == 1) {
                return ch;
            }
        }

        return '0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char firstNonRepeatedChar = findFirstNonRepeatedChar(str);

        if (firstNonRepeatedChar != '0') {
            System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
        } else {
            System.out.println("There are no non-repeated characters.");
        }

        scanner.close();
    }
}
