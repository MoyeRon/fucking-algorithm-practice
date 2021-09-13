package tree;

import common.TreeNode;

/**
 * @name: 翻转二叉树
 * @link: https://leetcode-cn.com/problems/invert-binary-tree/
 * @author: taoyouwei
 * @date: 2021/9/13
 **/
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
