package LeetCode.LinkedList;

import java.util.Arrays;

public class TwinSum {
    public int pairSum(ListNode head) {
        int n = length(head);
        int[] twinSums = new int[n / 2];
        ListNode current = head;
        for (int i = 0; i < n / 2; i++) {
            twinSums[i] = current.val + getTwin(current, n);
            current = current.next;
        }
        return Arrays.stream(twinSums).max().orElse(0);
    }

    private int getTwin(ListNode node, int n) {
        int index = n - 1 - getIndex(node, n);
        ListNode current = node;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    private int getIndex(ListNode node, int n) {
        int index = 0;
        ListNode current = node;
        while (current != null) {
            index++;
            current = current.next;
        }
        return index - 1;
    }

    private int length(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

}
