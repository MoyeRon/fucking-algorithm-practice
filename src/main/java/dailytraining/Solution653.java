package dailytraining;

import common.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @name: 两数之和 IV - 输入 BST
 * @link: https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
 * @author: taoyouwei
 * @date: 2022/3/21
 **/
public class Solution653 {
    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
