package CodeWars;

public class Droot {

    public static int digital_root(int n) {

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum > 9) {
            return digital_root(sum);
        } else {
            return sum;
        }


    }
}
