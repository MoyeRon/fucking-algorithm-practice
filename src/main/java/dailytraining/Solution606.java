package dailytraining;

import common.TreeNode;

/**
 * @name: 根据二叉树创建字符串
 * @link: https://leetcode-cn.com/problems/construct-string-from-binary-tree/
 * @author: taoyouwei
 * @date: 2022/3/19
 **/
public class Solution606 {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right == null) {
            return Integer.toString(root.val);
        }
        if (root.right == null) {
            return root.val + "(" + tree2str(root.left) + ")";
        }
        return root.val + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
    }

}
