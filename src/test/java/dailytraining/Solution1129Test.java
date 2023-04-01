package dailytraining;

import org.junit.Test;

public class Solution1129Test {

    @Test
    public void testShortestAlternatingPaths() {
        Solution1129 solution1129 = new Solution1129();
        int[] ints = solution1129.shortestAlternatingPaths(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}, new int[][]{{1, 2}, {2, 3}, {3, 1}});
        System.out.println(ints);
    }

    @Test
    public void testShortestAlternatingPaths1() {
        Solution1129 solution1129 = new Solution1129();
        int[] ints = solution1129.shortestAlternatingPaths(3, new int[][]{{0, 1}, {0, 2}}, new int[][]{{1, 0}});
        System.out.println(ints);
    }
}