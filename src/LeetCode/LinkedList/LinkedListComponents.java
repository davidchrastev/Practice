package LeetCode.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {



    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int connectedComponents = 0;
        boolean inComponent = false;
        ListNode temp = head;

        while (temp != null) {
            if (numSet.contains(temp.val)) {
                if (!inComponent) {
                    inComponent = true;
                    connectedComponents++;
                }
            } else {
                inComponent = false;
            }
            temp = temp.next;
        }

        return connectedComponents;
    }
}
