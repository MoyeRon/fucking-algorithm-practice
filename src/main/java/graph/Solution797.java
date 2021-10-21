package graph;

import java.util.LinkedList;
import java.util.List;

/**
 * @name: 所有可能的路径
 * @link: https://leetcode-cn.com/problems/all-paths-from-source-to-target/
 * @author: taoyouwei
 * @date: 2021/10/19
 **/
public class Solution797 {

    private List<List<Integer>> allPaths = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph.length == 0) {
            return allPaths;
        }
        List<Integer> path = new LinkedList<>();
        search(graph, path, 0, graph.length - 1);
        return allPaths;
    }

    public void search(int[][] graph, List<Integer> path, int node, int target) {
        path.add(node);
        if (node == target) {
            allPaths.add(new LinkedList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        int[] nextNodes = graph[node];
        for (int nextNode : nextNodes) {
            search(graph, path, nextNode, target);
        }
        path.remove(path.size() - 1);
    }
}
