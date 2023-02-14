package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                result.add(grades.get(i));
            } else {
                int first = grades.get(i) + 1;
                int second = grades.get(i) + 2;

                if (first % 5 == 0) {
                    result.add(first);
                } else if (second % 5 == 0) {
                    result.add(second);
                } else {
                    result.add(grades.get(i));
                }
            }
        }

        return result;

    }
}
