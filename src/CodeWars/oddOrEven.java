package CodeWars;

public class oddOrEven {

    public static String oddOrEven (int[] array) {
        if (array.length == 0) {
            return "odd";
        }
        int result = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            result += array[i];
        }

        if (result % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
