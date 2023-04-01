package dailytraining;

import java.util.*;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/2/2
 **/
public class Solution1129 {
    private Map<Integer, Set<Integer>> redMapping;

    private Map<Integer, Set<Integer>> blueMapping;

    private boolean[] isRedVisit;

    private boolean[] isBlueVisit;

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.MAX_VALUE;
        }
        init(n, redEdges, blueEdges);

        search(0, 0, result, true);
        search(0, 0, result, false);
        for (int i = 1; i < result.length; i++) {
            if (result[i] == Integer.MAX_VALUE) {
                result[i] = -1;
            }
        }
        result[0] = 0;
        return result;
    }

    private void search(int currentPos, int length, int[] result, boolean isRed) {
        Map<Integer, Set<Integer>> currentMapping = isRed ? redMapping : blueMapping;
        if (!currentMapping.containsKey(currentPos)) {
            return;
        }
        length++;
        boolean[] visited = isRed ? isRedVisit : isBlueVisit;
        Set<Integer> nextPos = currentMapping.get(currentPos);
        for (Integer nextPo : nextPos) {
            if (visited[nextPo] && result[nextPo] <= length) {
                continue;
            }
            result[nextPo] = Math.min(result[nextPo], length);

            visited[nextPo] = true;
            search(nextPo, length, result, !isRed);
        }
    }


    private void init(int n, int[][] redEdges, int[][] blueEdges) {
        redMapping = new HashMap<>();
        blueMapping = new HashMap<>();
        isRedVisit = new boolean[n];
        isBlueVisit = new boolean[n];
        initMapping(redEdges, redMapping);
        initMapping(blueEdges, blueMapping);
    }

    private void initMapping(int[][] redEdges, Map<Integer, Set<Integer>> mapping) {
        for (int[] redEdge : redEdges) {
            int edge = redEdge[0];
            if (mapping.containsKey(edge)) {
                mapping.get(edge).add(redEdge[1]);
            } else {
                Set<Integer> edges = new HashSet<>();
                edges.add(redEdge[1]);
                mapping.put(edge, edges);
            }
        }
    }
}
