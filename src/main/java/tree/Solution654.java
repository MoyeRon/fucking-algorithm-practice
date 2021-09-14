package tree;

import common.TreeNode;

import java.util.Arrays;

/**
 * @name: 最大二叉树
 * @link: https://leetcode-cn.com/problems/maximum-binary-tree/
 * @author: taoyouwei
 * @date: 2021/9/14
 **/
public class Solution654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode dummy = new TreeNode();
        construct(dummy, nums, true);
        return dummy.left;
    }

    public void construct(TreeNode parent, int[] nums, boolean isLeft) {
        if (nums.length == 0) {
            if (isLeft) {
                parent.left = null;
            } else {
                parent.right = null;
            }
            return;
        }
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(nums[index]);
        if (isLeft) {
            parent.left = node;
        } else {
            parent.right = node;
        }
        int[] leftNums, rightNums;
        if (index == 0) {
            leftNums = new int[0];
            rightNums = Arrays.copyOfRange(nums, index + 1, nums.length);
        } else if (index == nums.length - 1) {
            leftNums = Arrays.copyOfRange(nums, 0, index);
            rightNums = new int[0];
        } else {
            leftNums = Arrays.copyOfRange(nums, 0, index);
            rightNums = Arrays.copyOfRange(nums, index + 1, nums.length);
        }
        construct(node, leftNums, true);
        construct(node, rightNums, false);
    }
}
