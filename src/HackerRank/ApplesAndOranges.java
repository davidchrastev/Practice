package HackerRank;

import java.util.List;

public class ApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int applesInRange = 0;

        for (int i = 0; i < apples.size(); i++) {
            int current = apples.get(i) + a;
            if (current >= s && current <= t) {
                applesInRange++;
            }
        }
        System.out.println(applesInRange);

        int orangesInRange = 0;

        for (int i = 0; i < oranges.size(); i++) {
            int current = oranges.get(i) + b;
            if (current >= s && current <= t) {
                orangesInRange++;
            }

        }
        System.out.println(orangesInRange);


    }
}
