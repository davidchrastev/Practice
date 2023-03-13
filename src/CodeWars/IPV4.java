package CodeWars;

public class IPV4 {
    public static long ipsBetween(String start, String end) {
        long startAddress = ipToLong(start);
        long endAddress = ipToLong(end);
        return endAddress - startAddress;
    }

    private static long ipToLong(String ipAddress) {
        String[] ipAddressInArray = ipAddress.split("\\.");
        long result = 0;
        for (int i = 0; i < ipAddressInArray.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(ipAddressInArray[i]);
            result += ip * Math.pow(256, power);
        }
        return result;
    }

}
