package HackerRank;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int valleys = 0;
        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                altitude++;
            } else {
                altitude--;
            }
            if (altitude == 0 && step == 'U') {
                valleys++;
            }
        }
        return valleys;

    }
}
