package LeetCode.matrix;

import java.util.*;

public class KWeakest {

    public int[] kWeakestRows(int[][] mat, int k) {


        Map<Integer, Integer> soldiers = new LinkedHashMap<>();


        for (int row = 0; row < mat.length; row++) {
            int count = 0;
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == 1) {
                    count++;
                }
            }
            soldiers.put(row, count);
        }


        int[] soldiersSorted = new int[k];
        List<Integer> soldiersSortedList = new ArrayList<>();

        soldiers.entrySet()
                .stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> soldiersSortedList.add(e.getKey()));


        for (int i = 0; i < k; i++) {
            soldiersSorted[i] = soldiersSortedList.get(i);
        }


        return soldiersSorted;

    }
}
