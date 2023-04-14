package LeetCode.Data_Structures_1;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();


        if (s.length() != t.length()) {
            return false;
        }

        char[] charArrayA = s.toCharArray();
        char[] charArrayB = t.toCharArray();

        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        return Arrays.equals(charArrayA, charArrayB);
    }
}


