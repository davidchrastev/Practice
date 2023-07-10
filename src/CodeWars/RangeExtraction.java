package CodeWars;

public class RangeExtraction {
    public String rangeExtraction(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int start = arr[0];
        int prev = start;

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            if (curr == prev + 1) {

                prev = curr;
            } else {

                if (start == prev) {

                    sb.append(start).append(",");
                } else if (prev == start + 1) {

                    sb.append(start).append(",").append(prev).append(",");
                } else {

                    sb.append(start).append("-").append(prev).append(",");
                }
                start = curr;
                prev = curr;
            }
        }


        if (start == prev) {

            sb.append(start);
        } else if (prev == start + 1) {

            sb.append(start).append(",").append(prev);
        } else {

            sb.append(start).append("-").append(prev);
        }

        return sb.toString();
    }

}
