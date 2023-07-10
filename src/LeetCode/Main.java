package LeetCode;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet shortSet = new HashSet();

        for (short i = 0; i < 100; i++) {
            shortSet.add(i);
            shortSet.remove(i - 1);
        }

        System.out.println(shortSet.size());

        String s3 = "JournalDev";
        int start = 1;
        char end = 5;

        System.out.println(s3.substring(start, end));

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is:" + s1 == s2);
    }
}
