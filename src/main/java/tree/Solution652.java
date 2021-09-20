package tree;

import common.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @name: 寻找重复的子树
 * @link: https://leetcode-cn.com/problems/find-duplicate-subtrees/
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class Solution652 {

    private HashMap<String, Integer> map = new HashMap<>();

    private LinkedList<TreeNode> list = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return list;

    }

    public String traverse(TreeNode node) {
        if (node == null) {
            return "#";
        }
        String left = traverse(node.left);
        String right = traverse(node.right);
        String subTree = left + "," + right + "," + node.val;
        int freq = map.getOrDefault(subTree, 0);
        if (freq == 1) {
            list.add(node);
        }
        map.put(subTree, freq + 1);
        return subTree;
    }


}
