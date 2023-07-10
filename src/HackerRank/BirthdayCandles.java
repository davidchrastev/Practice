package HackerRank;

import java.util.List;

public class BirthdayCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        int count = 0;

        for (Integer num : candles) {
            if (num > max) {
                max = num;
            }
        }
        for (Integer num : candles) {
            if (num == max) {
                count++;
            }
        }

        return count;

    }
}
