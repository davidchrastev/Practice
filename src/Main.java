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



        Integer result = Integer.parseInt(getNumber(tokens.get(0).split("")));

        boolean isNegative = false;

        for (int i  = 1; i <tokens.size(); i += 2) {
            if (tokens.get(i).equals("minus")) {
                isNegative = true;
                result -= Integer.parseInt(getNumber(tokens.get(i + 1).split("")));

            } else {
                result += Integer.parseInt(getNumber(tokens.get(i + 1).split("")));

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
        // keep this function call here
        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        StringChallenge(str);
        System.out.print(StringChallenge(s.nextLine()));
    }

    public static String getNumber(String[] arr) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (String s : arr) {
            switch (word.toString()) {
                case "one":
                    result.append("1");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "two":
                    result.append("2");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "three":
                    result.append("3");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "four":
                    result.append("4");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "five":
                    result.append("5");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "six":
                    result.append("6");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "seven":
                    result.append("7");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "eight":
                    result.append("8");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "nine":
                    result.append("9");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                case "zero":
                    result.append("0");
                    word = new StringBuilder();
                    word.append(s);
                    break;
                default:
                    word.append(s);
                    break;
            }
        }

        switch (word.toString()) {
            case "one":
                result.append("1");

                break;
            case "two":
                result.append("2");

                break;
            case "three":
                result.append("3");

                break;
            case "four":
                result.append("4");

                break;
            case "five":
                result.append("5");

                break;
            case "six":
                result.append("6");

                break;
            case "seven":
                result.append("7");

                break;
            case "eight":
                result.append("8");

                break;
            case "nine":
                result.append("9");

                break;
            case "zero":
                result.append("0");

                break;

        }
        return result.toString();

    }
}





