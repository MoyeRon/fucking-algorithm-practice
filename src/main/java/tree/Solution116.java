package tree;

import common.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @name: 填充每个节点的下一个右侧节点指针
 * @link: https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/
 * @author: taoyouwei
 * @date: 2021/9/13
 **/
public class Solution116 {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int target = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (count != target) {
                current.next = queue.peek();
            } else {
                target = target * 2 + 2;
            }
            if (current.left != null || current.right != null) {
                queue.add(current.left);
                queue.add(current.right);
                count++;
            }
        }
        return root;
    }

    public Node connect1(Node node) {
        if (node == null) {
            return null;
        }
        connectTwoNode(node.left, node.right);
        return node;
    }

    public void connectTwoNode(Node node1, Node node2) {
        if (node1 == null || node2 == null) {
            return;
        }
        node1.next = node2;
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node2.left, node2.right);
        connectTwoNode(node1.right, node2.left);
    }
}
