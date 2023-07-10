import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnagramFinder {
    public static List<String> findAnagrams(String word, List<String> wordList) {
        String sortedWord = sortCharacters(word.toLowerCase().replaceAll("\\s", ""));

        List<String> anagrams = new ArrayList<>();

        for (String currentWord : wordList) {
            String sortedCurrentWord = sortCharacters(currentWord.toLowerCase().replaceAll("\\s", ""));

            if (sortedWord.equals(sortedCurrentWord)) {
                anagrams.add(currentWord);
            }
        }

        return anagrams;
    }

    private static String sortCharacters(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.print("Enter a list of words (comma-separated): ");
        String words = scanner.nextLine();
        List<String> wordList = Arrays.asList(words.split(","));

        List<String> anagrams = findAnagrams(word, wordList);

        System.out.println("Anagrams of the word \"" + word + "\" are: " + anagrams);

        scanner.close();
    }
}

