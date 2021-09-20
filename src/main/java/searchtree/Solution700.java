package searchtree;

import common.TreeNode;

/**
 * @name: 二叉搜索树中的搜索
 * @link: https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class Solution700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
