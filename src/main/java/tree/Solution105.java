package tree;

import common.TreeNode;

import java.util.Arrays;

/**
 * @name: 从前序与中序遍历序列构造二叉树
 * @link: https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @author: taoyouwei
 * @date: 2021/9/16
 **/
public class Solution105 {
    private int[] preorder;
    private int[] inorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        this.preorder = preorder;
        this.inorder = inorder;
        int preorderLeft = 0, inorderLeft = 0;
        int preorderRight = preorder.length - 1, inorderRight = inorder.length - 1;
        return build(preorderLeft, preorderRight, inorderLeft, inorderRight);
    }

    public TreeNode build(int preorderLeft, int preorderRight, int inorderLeft, int inorderRight) {
        if (preorderLeft > preorderRight) {
            return null;
        }
        int val = preorder[preorderLeft];
        TreeNode node = new TreeNode(val);
        int valInorderIndex = valIndex(inorder, inorderLeft, inorderRight, val);
        int leftSize = valInorderIndex - inorderLeft;
        node.left = build(preorderLeft + 1, preorderLeft + leftSize, inorderLeft, valInorderIndex - 1);
        node.right = build(preorderLeft + leftSize + 1, preorderRight, valInorderIndex + 1, inorderRight);
        return node;

    }

    public int valIndex(int[] nums, int left, int right, int target) {
        for (int i = left; i <= right; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
