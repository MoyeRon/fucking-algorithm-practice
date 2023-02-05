package dailytraining;

import common.TreeNode;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/2/5
 **/
public class Solution1145 {
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode target = search(root, x);
        rebuildTree(root);
        int parentVal = root.val - target.val;
        int leftVal = target.left == null ? 0 : target.left.val;
        int rightVal = target.right == null ? 0 : target.right.val;
        int blue = Math.max(parentVal, Math.max(leftVal, rightVal));
        return 2 * blue > root.val;
    }

    private int rebuildTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = rebuildTree(node.left);
        int right = rebuildTree(node.right);
        node.val = left + right + 1;
        return node.val;
    }

    private TreeNode search(TreeNode node, int target) {
        if (node == null) {
            return null;
        }
        if (node.val == target) {
            return node;
        }
        TreeNode leftSearch = search(node.left, target);
        if (leftSearch != null) {
            return leftSearch;
        }
        TreeNode rightSearch = search(node.right, target);
        if (rightSearch != null) {
            return rightSearch;
        }
        return null;
    }
}
