package dailytraining;

import common.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2022/3/10
 **/
public class Solution589 {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        search(result, root);
        return result;
    }

    private void search(List<Integer> result, Node node) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        node.children.forEach(child -> search(result, child));
    }

}
