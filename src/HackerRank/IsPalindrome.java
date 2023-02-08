package HackerRank;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        int counter = 0;
        int check = 0;

        for (int i = A.length() - 1; i >= 0; i--) {
            if (A.charAt(counter) == A.charAt(i)) {
                check++;
                counter++;
            }
        }

        if (check == A.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
