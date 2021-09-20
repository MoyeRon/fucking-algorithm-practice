package searchtree;

import common.TreeNode;

/**
 * @name: 删除二叉搜索树中的节点
 * @link: https://leetcode-cn.com/problems/delete-node-in-a-bst/
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class Solution450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

    public TreeNode getMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }
}
