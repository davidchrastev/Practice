package LeetCode.matrix;

public class Beams {
    public int numberOfBeams(String[] bank) {
        int beams = 0;
        int prevNum = 0;
        int currentNum = 0;
        for (int i = 0;i < bank.length; i++){
            currentNum = countOnes(bank[i]);
            beams += currentNum * prevNum;
            if (currentNum != 0) {
                prevNum = currentNum;
            }
        }
        return beams;
    }

    private int countOnes(String str){
        int count = 0;
        for (int i = 0;i < str.length(); i++){
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
