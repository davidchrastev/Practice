package HackerRank.basicSolveTest;

import java.util.*;

public class Result {

    public static List<String> mostActive(List<String> customers) {
        Map<String, Integer> tradeCounts = new HashMap<>();
        for (String customer : customers) {
            tradeCounts.put(customer, tradeCounts.getOrDefault(customer, 0) + 1);
        }

        List<String> activeCustomers = new ArrayList<>();
        int totalTrades = customers.size();
        for (Map.Entry<String, Integer> entry : tradeCounts.entrySet()) {
            if ((double) entry.getValue() / totalTrades >= 0.05) {
                activeCustomers.add(entry.getKey());
            }
        }

        Collections.sort(activeCustomers);
        return activeCustomers;
    }
}
