package LeetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subarrays {
    public static long zeroFilledSubarray(int[] nums) {
//        long countZeros = 0;
//        long windowSize = 0;
//        for (int num : nums) {
//            if (num == 0) {
//                windowSize++;
//            } else {
//                if (windowSize > 0) {
//                    countZeros += (windowSize * (windowSize + 1)) / 2;
//                    windowSize = 0;
//                }
//            }
//        }
//        if (windowSize > 0) {
//            countZeros += (windowSize * (windowSize + 1)) / 2;
//        }
//        return countZeros;

        long ans = 0;
        long count = 0;

        for (int num : nums) {
            if (num == 0) {
                count++;
            } else {
                count = 0;
            }
            ans = ans + count;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(zeroFilledSubarray(new int[]{0,0,0,0,0}));
    }

}
