package CodeWars;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {

        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }

        int bounces = 0;
        h = h * bounce;

        while (h > window) {
            bounces += 2;
            h = h * bounce;
        }
        return bounces - 1;
    }
}
