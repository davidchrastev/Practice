import java.util.*;
import java.io.*;

class Main {

    public static String StringChallenge(String str) {
        Map<String, Integer> wordToNum = new HashMap<>();
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
        wordToNum.put("onezero", 10);


        List<String> tokens = new ArrayList<>();
        int startIndex = 0;

        for (int i  = 0;i < str.length();i++) {
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



        Integer result = getNumber(tokens.get(0).split(""), wordToNum);

        boolean isNegative = false;

        for (int i  = 1; i <tokens.size(); i += 2) {
            if (tokens.get(i).equals("minus")) {
                isNegative = true;
                result -= getNumber(tokens.get(i + 1).split(""), wordToNum);

            } else {
                result += getNumber(tokens.get(i + 1).split(""), wordToNum);

            }
        }
        StringBuilder output = new StringBuilder();
        if (isNegative) {
            output.append("negative");
        }

        String resultString = Integer.toString(Math.abs(result));
        for(int i = 0; i < resultString.length(); i++) {
            int current = i;
            output.append(wordToNum.keySet()
                    .stream()
                    .filter(key -> wordToNum.get(key) == Integer.parseInt(resultString.substring(current, current + 1)))
                    .findFirst()
                    .orElse(""));
        }

        return output.toString();
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(StringChallenge(s.nextLine()));

//      onezeropluseight
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
}
