package LeetCode.arrays;

public class Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int possiblePositions = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i-1] == 0) &&
                    (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {

                flowerbed[i] = 1;
                possiblePositions++;
            }
            if (possiblePositions >= n) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

    }

}
