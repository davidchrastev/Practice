package HackerRank;

import java.util.Scanner;

public class JavaStrings {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length = A.length() + B.length();

        System.out.println(length);

        int compare = A.compareTo(B);

        if (compare > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String upper = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String upperSecond = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.println(upper + " " + upperSecond);



    }
}
