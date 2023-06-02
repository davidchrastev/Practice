public class Palindromes {

    public static void main(String[] args) {
        String str = "inni";

        System.out.println(checkPalindrome(str));
    }

    private static String checkPalindrome(String str) {
        int counter = str.length() - 1;

        for (int i = 0; i <= str.length() - 1; i++) {

            if (str.charAt(i) !=  str.charAt(counter)) {
                return "IT'S NOT A PALINDROME " + str;
            }
            counter--;
        }

        return "IT'S A PALINDROME " + str;
    }
}
