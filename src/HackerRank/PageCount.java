package HackerRank;

public class PageCount {
    public static int pageCount(int n, int p) {
        int fromStart = p / 2;
        int fromEnd = (n / 2) - (p / 2);
        return Math.min(fromStart, fromEnd);
    }
}
