import java.util.*;
import java.io.*;

public class Main {

    private static final Map<String, Integer> wordToNum = new HashMap<>();
    private static boolean isNegative = false;
    private static final List<String> tokens = new ArrayList<>();

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(StringChallenge(s.nextLine()));

        //onezeropluseight
        //twozeroplusonezero
        //twozeroplusonezerominustwozero
    }

    public static String StringChallenge(String str) {
        fillMap();

        getTokens(str);

        int sum = getSum();

        return getResult(sum);
    }

    private static void fillMap() {
        wordToNum.put("zero", 0);
        wordToNum.put("one", 1);
        wordToNum.put("two", 2);
        wordToNum.put("three", 3);
        wordToNum.put("four", 4);
        wordToNum.put("five", 5);
        wordToNum.put("six", 6);
        wordToNum.put("seven", 7);
        wordToNum.put("eight", 8);
        wordToNum.put("nine", 9);
    }

    private static void getTokens(String str) {
        int startIndex = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'p')  {
                tokens.add(str.substring(startIndex, i));
                tokens.add(str.substring(i, i + 4));
                startIndex = i + 4;
            }
            if (str.charAt(i) == 'm') {
                tokens.add(str.substring(startIndex, i));
                tokens.add(str.substring(i, i + 5));
                startIndex = i + 5;
            }

        }

        tokens.add(str.substring(startIndex));
    }

    private static int getSum() {
        int sum = getNumber(tokens.get(0).split(""), wordToNum);

        for (int i  = 1; i <tokens.size(); i += 2) {
            switch (tokens.get(i)) {
                case "minus" -> {
                    sum -= getNumber(tokens.get(i + 1).split(""), wordToNum);
                }
                case "plus" -> sum += getNumber(tokens.get(i + 1).split(""), wordToNum);
            }
        }
        return sum;
    }

    public static int getNumber(String[] arr, Map<String, Integer> words) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (String s : arr) {
            if (words.containsKey(word.toString())) {
                result.append(words.get(word.toString()));
                word = new StringBuilder(s);
            } else {
                word.append(s);
            }
        }

        result.append(words.get(word.toString()));
        return Integer.parseInt(result.toString());
    }

    private static String getResult(int sum) {
        StringBuilder result = new StringBuilder();

        if (sum < 0) {
            isNegative = true;
        }

        if (isNegative) {
            result.append("negative");
        }

        String sumToString = Integer.toString(Math.abs(sum));
        for(int i = 0; i < sumToString.length(); i++) {
            int current = i;
            result.append(wordToNum.keySet()
                    .stream()
                    .filter(key -> wordToNum.get(key) == Integer.parseInt(sumToString.substring(current, current + 1)))
                    .findFirst()
                    .orElse(""));
        }

        return result.toString();
    }
}
