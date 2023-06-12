package LeetCode;

public class IsPalindromeNumber {

    public boolean isPalindrome(int x) {
        String checker = x + "";
        int counter = checker.length() - 1;

        for (int i = 0; i < checker.length(); i++) {
            if (checker.charAt(i) != checker.charAt(counter)) {
                return false;
            }
            counter--;
        }

        return true;
    }
}
