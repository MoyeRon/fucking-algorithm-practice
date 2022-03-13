package dailytraining;

import common.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @name: N 叉树的后序遍历
 * @link: https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 * @author: taoyouwei
 * @date: 2022/3/13
 **/
public class Solution590 {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        order(result, root);
        return result;
    }

    public void order(List<Integer> result, Node node) {
        if (node == null) {
            return;
        }
        node.children.forEach(n -> order(result, n));
        result.add(node.val);
    }
}
