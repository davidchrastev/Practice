package HackerRank;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();


        if (a.length() != b.length()) {
            return false;
        }

        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);

    }
}
