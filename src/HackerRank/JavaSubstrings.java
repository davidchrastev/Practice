package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSubstrings {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            substrings.add(s.substring(i, i + k));
        }

        Collections.sort(substrings);
        smallest = substrings.get(0);
        largest = substrings.get(substrings.size() - 1);

        return smallest + "\n" + largest;
    }
}
