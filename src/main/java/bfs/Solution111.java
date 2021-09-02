package bfs;

import common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @name: 二叉树的最小深度
 * @link: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * @author: taoyouwei
 * @date: 2021/9/2
 **/
public class Solution111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int deep = 0;
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return deep + 1;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            deep++;
        }
        return -1;
    }
}
