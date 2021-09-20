package searchtree;

import common.TreeNode;

/**
 * @name: 二叉搜索树中第K小的元素
 * @link: https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class Solution230 {
    private int current;

    private int kthValue;

    private boolean isFound;

    public int kthSmallest(TreeNode root, int k) {
        current = 0;
        isFound = false;
        search(root, k);
        return kthValue;
    }

    public void search(TreeNode node, int k) {
        if (node == null || isFound) {
            return;
        }
        search(node.left, k);
        if (isFound) {
            return;
        }
        if (k == current + 1) {
            kthValue = node.val;
            isFound = true;
            return;
        } else {
            current++;
        }
        search(node.right, k);
    }
}
