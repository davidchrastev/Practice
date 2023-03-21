package LeetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subarrays {
    public static long zeroFilledSubarray(int[] nums) {
        int countZeros = 0;
        int sub = 0;
        int index = 0;
        boolean previous = false;

        while (index < nums.length) {

            if (previous && nums[index] == 0) {
                sub++;
                countZeros++;
            } else if (nums[index] == 0) {
                countZeros++;
                previous = true;
            } else {
                countZeros += sub;
                sub = 0;
                previous = false;
            }





            index++;
        }


        return countZeros;
    }

    public static void main(String[] args) {
        System.out.println(zeroFilledSubarray(new int[]{0,0,0,2,0,0}));
    }

}
