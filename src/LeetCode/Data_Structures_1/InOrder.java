package LeetCode.Data_Structures_1;

import java.util.ArrayList;
import java.util.List;

public class InOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalHelper(root, result);
        return result;
    }

    private void inorderTraversalHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorderTraversalHelper(root.left, result);
        result.add(root.val);
        inorderTraversalHelper(root.right, result);
    }
}
