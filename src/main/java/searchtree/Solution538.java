package searchtree;

import common.TreeNode;

/**
 * @name: 把二叉搜索树转换为累加树
 * @link: https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class Solution538 {

    private int sum;

    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        convert(root);
        return root;
    }

    public void convert(TreeNode node) {
        if (node == null) {
            return;
        }
        convert(node.right);
        sum += node.val;
        node.val = sum;
        convert(node.left);
    }
}
