package dailytraining;

import common.TreeNode;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/2/6
 **/
public class Solution2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null || root.right == null) {
            return root.val == 1;
        }
        if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
