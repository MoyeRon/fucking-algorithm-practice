package common;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2021/9/20
 **/
public class TreeNodeUtils {

    public static TreeNode treeGen(String[] nodes) {
        if (nodes.length == 0) {
            return null;
        }
        return gen(nodes, 0);
    }

    public static TreeNode gen(String[] nodes, int current) {
        if (current >= nodes.length || nodes[current] == "null") {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(nodes[current]));
        node.left = gen(nodes, current * 2 + 1);
        node.right = gen(nodes, current * 2 + 2);
        return node;
    }
}
