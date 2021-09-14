package tree;

import common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @name: 二叉树展开为链表
 * @link: https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 * @author: taoyouwei
 * @date: 2021/9/14
 **/
public class Solution114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> list = new LinkedList<>();
        search(root, list);
        TreeNode dummy = new TreeNode();
        TreeNode current = dummy;
        while (!list.isEmpty()) {
            if (!list.isEmpty()) {
                current.right = list.peek();
            } else {
                current.right = null;
            }
            current.left = null;
            current = list.poll();
        }
        root = dummy.right;
    }

    public void search(TreeNode node, Queue<TreeNode> list) {
        if (node == null) {
            return;
        }
        list.add(node);
        search(node.left, list);
        search(node.right, list);
    }

    public void flatten1(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten1(root.left);
        flatten1(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        TreeNode p = root;
        while (p.right != null) {
            p = p.right;
        }
        p.right = right;
    }
}
