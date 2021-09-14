package tree;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution654Test {

    Solution654 solution654 = new Solution654();

    @Test
    public void constructMaximumBinaryTreeTest() {
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};
        TreeNode treeNode = solution654.constructMaximumBinaryTree(nums);
        System.out.println("");
    }
}