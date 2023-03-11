package HackerRank;

import java.util.HashMap;
import java.util.List;

public class BetweenTwoSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            boolean factorA = true;
            boolean factorB = true;

            for (Integer num : a) {
                if (i % num != 0) {
                    factorA = false;
                    break;
                }
            }

            for (Integer num : b) {
                if (i % num != 0) {
                    factorB = false;
                    break;
                }
            }

            if (factorA && factorB) {
                count++;
            }

            Map<Worker, Double> workers = new HashMap<>();

            worker.entrySet()
                    .stream()
                    sorted

        }
        return count;

    }
}
