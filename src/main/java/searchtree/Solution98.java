package searchtree;

import common.TreeNode;

/**
 * @name: 验证二叉搜索树
 * @link: https://leetcode-cn.com/problems/validate-binary-search-tree/
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class Solution98 {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode node, long leftLimit, long rightLimit) {
        if (node == null) {
            return true;
        }
        if (leftLimit < node.val && node.val < rightLimit) {
            return valid(node.left, leftLimit, node.val) && valid(node.right, node.val, rightLimit);
        } else {
            return false;
        }
    }
}
