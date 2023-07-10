package CodeWars;

import java.util.Arrays;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        int leftSide = 0;
        int rightSide = Arrays.stream(arr).sum();

        for (int i = 0; i < arr.length; i++) {
            rightSide -= arr[i];
            if (rightSide == leftSide) {
                return i;
            }
            leftSide += arr[i];
        }
        return -1;
    }
}
