package LeetCode.LinkedList;

public class ConvertBinary {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode current = head;

        while (current != null) {
            result = result * 2 + current.val;
            current = current.next;
        }

        return result;
    }
}
