package dailytraining;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/1
 **/
public class Solution2373 {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        res[i][j] = Math.max(res[i][j], grid[x][y]);
                    }
                }
            }
        }
        return res;
    }
}
