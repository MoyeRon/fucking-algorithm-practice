package dailytraining;

import java.util.TreeSet;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/30
 **/
public class Solution1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        TreeSet<Integer> pos = new TreeSet<>();
        for (int i = 0; i < points.length; i++) {
            pos.add(points[i][0]);
        }
        int l = pos.pollFirst();
        int max = Integer.MIN_VALUE;
        while (!pos.isEmpty()) {
            max = Math.max(pos.first() - l, max);
            l = pos.pollFirst();
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
