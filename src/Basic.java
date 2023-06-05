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

}
