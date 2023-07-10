package LeetCode.LinkedList;


public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode nodeHead = new ListNode(0);
        ListNode currentNode = head;
        ListNode nodeTail = nodeHead;
        int currentSum = 0;

        while (currentNode.next != null) {
            if (currentNode.val == 0) {
                if (currentSum > 0) {
                    nodeTail.next = new ListNode(currentSum);
                    nodeTail = nodeTail.next;
                    currentSum = 0;
                }
            } else {
                currentSum += currentNode.val;
            }
            currentNode = currentNode.next;
        }
        if (currentSum > 0) {
            nodeTail.next = new ListNode(currentSum);
        }

        return nodeHead.next;
    }


    public static void main(String[] args) {

    }
}
