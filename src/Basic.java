import java.util.*;

public class Basic {
    public static void main(String[] args) {

    }

    public static List<String> deviceNamesSystem(List<String> devicenames) {
        Map<String, Integer> checker = new HashMap<>();
        List<String> output = new ArrayList<>();

        for (String deviceName : devicenames) {
            if (checker.containsKey(deviceName)) {
                int count = checker.get(deviceName) + 1;
                checker.put(deviceName, count);
                String newDeviceName = deviceName + count;
                output.add(newDeviceName);
            } else {
                checker.put(deviceName, 0);
                output.add(deviceName);
            }
        }

        return output;

    }

    public static String dnaComplement(String s) {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentSymbol = s.charAt(i);
            char currentOppositeSymbol;

            switch (currentSymbol) {
                case 'A':
                    currentOppositeSymbol = 'T';
                    break;
                case 'T':
                    currentOppositeSymbol = 'A';
                    break;
                case 'C':
                    currentOppositeSymbol = 'G';
                    break;
                case 'G':
                    currentOppositeSymbol = 'C';
                    break;
                default:
                    currentOppositeSymbol = currentSymbol;
            }

            output.append(currentOppositeSymbol);
        }

        return output.reverse().toString();
    }

    public static long calculateAmount(List<Integer> prices) {
        long alexSumToPay = prices.get(0);
        int minPrice = prices.get(0);

        for (int i = 1; i < prices.size(); i++) {
            int currentPrice = prices.get(i);

            int currentPriceWithDiscount = Math.max(currentPrice - minPrice, 0);
            alexSumToPay += currentPriceWithDiscount;


            minPrice = Math.min(minPrice, currentPrice);
        }

        return alexSumToPay;
    }


}
