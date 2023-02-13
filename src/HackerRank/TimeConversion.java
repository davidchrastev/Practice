package HackerRank;

public class TimeConversion {
    public static String timeConversion(String s) {
        String start = s.substring(0, 2);
        String end = s.substring(2, 8);

        int hour = Integer.parseInt(s.substring(0, 2));

        if (s.contains("P") && hour < 12) {
            hour += 12;
            start = String.valueOf(hour);

        } else if (s.contains("A") && hour == 12) {
            start = "00";
        }

        return start + end;


    }
}
