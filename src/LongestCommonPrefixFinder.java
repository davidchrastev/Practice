import java.util.Scanner;

public class LongestCommonPrefixFinder {
    public static String findLongestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }

        String longestCommonPrefix = strings[0];

        for (int i = 1; i < strings.length; i++) {
            String currentString = strings[i];

            int j = 0;
            while (j < longestCommonPrefix.length() && j < currentString.length()
                    && longestCommonPrefix.charAt(j) == currentString.charAt(j)) {
                j++;
            }

            longestCommonPrefix = longestCommonPrefix.substring(0, j);

            if (longestCommonPrefix.isEmpty()) {
                break;
            }
        }

        return longestCommonPrefix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        String longestCommonPrefix = findLongestCommonPrefix(strings);

        System.out.println("The longest common prefix is: " + longestCommonPrefix);

        scanner.close();
    }
}
