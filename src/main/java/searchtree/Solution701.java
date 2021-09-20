package searchtree;

import common.TreeNode;

/**
 * @name: 二叉搜索树中的插入操作
 * @link: https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class Solution701 {


    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        insert(root, val);
        return root;
    }

    public void insert(TreeNode node, int val) {
        if (node == null) {
            return;
        }
        if (val < node.val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                insert(node.left, val);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                insert(node.right, val);
            }

        }
    }

}
