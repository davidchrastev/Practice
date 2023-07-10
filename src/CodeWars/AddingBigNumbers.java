package CodeWars;

import java.math.BigInteger;

public class AddingBigNumbers {

    public static String add(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        return num1.add(num2).toString();

        //cheat solution not good
    }
}
