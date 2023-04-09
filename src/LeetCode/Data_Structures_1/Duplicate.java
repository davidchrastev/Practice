package LeetCode.Data_Structures_1;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        Arrays.stream(nums)
                .forEach(e -> System.out.println(set.add(e)));

        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
    }
}
