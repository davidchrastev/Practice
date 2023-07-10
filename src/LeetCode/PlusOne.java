package LeetCode;

import java.util.List;

public class PlusOne {
        public List<Integer> plusOne(List<Integer> digits) {
            int carry = 1;
            for (int i = digits.size() - 1; i >= 0; i--) {
                int digit = digits.get(i);
                digit += carry;
                if (digit == 10) {
                    digits.set(i, 0);
                    carry = 1;
                } else {
                    digits.set(i, digit);
                    carry = 0;
                    break;
                }
            }

            if (carry == 1) {
                digits.add(0, 1);
            }

            return digits;
        }

}

