package HackerRank.basicSolveTest;

public class Result2 {

    public static String findSubstring(String s, int k) {
        if (s == null || s.length() < k || k == 0) {
            return "Not found!";
        }

        String maxSubstring = "";
        int maxVowels = 0;
        int vowelsCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelsCount++;
            }
        }
        if (vowelsCount > maxVowels) {
            maxVowels = vowelsCount;
            maxSubstring = s.substring(0, k);
        }

        for (int i = 1; i <= s.length() - k; i++) {
            char prevChar = s.charAt(i - 1);
            char nextChar = s.charAt(i + k - 1);
            if (isVowel(prevChar)) {
                vowelsCount--;
            }
            if (isVowel(nextChar)) {
                vowelsCount++;
            }
            if (vowelsCount > maxVowels) {
                maxVowels = vowelsCount;
                maxSubstring = s.substring(i, i + k);
            }
        }

        return maxSubstring.isEmpty() ? "Not found!" : maxSubstring;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
