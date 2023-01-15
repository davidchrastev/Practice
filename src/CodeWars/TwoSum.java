package CodeWars;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");


//        //Create array for result
//        int[] res = new int[2];
//
//        //Double loop to find required indexes
//        for(int i = 1; i < numbers.length; i++){
//            for( int j = 0; j < i; j++){
//
//                //if any of indexes is fit, fill result and break the loops
//                if((numbers[j] + numbers[i]) == target){
//                    res[0] = j;
//                    res[1] = i;
//                    break;
//                }
//            }
//        }
//        return res; // Do your magic!

    }
}
