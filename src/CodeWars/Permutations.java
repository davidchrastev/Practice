package CodeWars;

import java.util.HashSet;
import java.util.Set;

public class Permutations {

//    public static Set<String> permute(String input) {
//        Set<String> permutations = new HashSet<>();
//        permuteHelper(input.toCharArray(), 0, permutations);
//        return permutations;
//    }
//
//    private static void permuteHelper(char[] input, int index, Set<String> permutations) {
//        if (index == input.length - 1) {
//            permutations.add(new String(input));
//        } else {
//            for (int i = index; i < input.length; i++) {
//                swap(input, index, i);
//                permuteHelper(input, index + 1, permutations);
//                swap(input, index, i);
//            }
//        }
//    }
//
//    private static void swap(char[] input, int i, int j) {
//        char temp = input[i];
//        input[i] = input[j];
//        input[j] = temp;
//    }
}
