package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class SumOfArray {
    public static void plusMinus(List<Integer> arr) {
        double zeros = 0;
        double positives = 0;
        double negatives = 0;

        for (Integer num : arr) {
            if (num < 0) {
                negatives++;
            }
            if (num > 0) {
                positives++;
            }
            if (num == 0) {
                zeros++;
            }
        }

        double resultPositives = positives / arr.size();
        double resultNegatives = negatives / arr.size();
        double resultZeros = zeros/ arr.size();

        System.out.println(resultPositives);
        System.out.println(resultNegatives);
        System.out.println(resultZeros);


    }
}
