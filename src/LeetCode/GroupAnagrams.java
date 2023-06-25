package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!anagrams.containsKey(sortedStr)) {
                anagrams.put(sortedStr, new ArrayList<>());
            }
            anagrams.get(sortedStr).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }

    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(strs);
        System.out.println(result);
    }
}
