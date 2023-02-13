package HackerRank;

import java.util.List;

public class MinMax {

    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0);
        long max = arr.get(0);
        long totalSum = 0;

        for (Integer n : arr) {
            totalSum += n;
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        System.out.println((totalSum - max) + " " + (totalSum - min));
    }
}
