package CodeWars;

import java.util.HashSet;
import java.util.Set;

public class isIsogram {

    public static boolean  isIsogram(String str) {
        Set<String> checker = new HashSet<>();

        for (int i = 0;i <= str.length() - 1;i++) {
            String k = String.valueOf(str.charAt(i)).toLowerCase();
            if (checker.contains(k)) {
                return false;
            }
            checker.add(k);
        }
        return true;
    }
}

