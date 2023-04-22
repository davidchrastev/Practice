package LeetCode.Data_Structures_1;

public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode node, long minVal, long maxVal) {
        if (node == null) {
            return true;
        }

        if (node.val <= minVal || node.val >= maxVal) {
            return false;
        }

        return isValidBSTHelper(node.left, minVal, node.val) && isValidBSTHelper(node.right, node.val, maxVal);
    }

}
