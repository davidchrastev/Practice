package CodeWars;

public class SuperMarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] tills = new int[n];
        for (int i : customers) {
            tills[getMinIndex(tills)] += i;
        }
        return getMax(tills);
    }

    private static int getMinIndex(int[] array) {
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
