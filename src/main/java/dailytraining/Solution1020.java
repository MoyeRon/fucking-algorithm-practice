package dailytraining;

/**
 * @name: 飞地的数量
 * @link: https://leetcode-cn.com/problems/number-of-enclaves/
 * @author: taoyouwei
 * @date: 2022/2/12
 **/
public class Solution1020 {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            backTrace(grid, i, 0);
            backTrace(grid, i, n - 1);
        }
        for (int i = 0; i < n; i++) {
            backTrace(grid, 0, i);
            backTrace(grid, m - 1, i);
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public void backTrace(int[][] grid, int i, int j) {
        if (i < 0 || i == grid.length) {
            return;
        }
        if (j < 0 || j == grid[0].length) {
            return;
        }
        if (grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        backTrace(grid, i + 1, j);
        backTrace(grid, i - 1, j);
        backTrace(grid, i, j + 1);
        backTrace(grid, i, j - 1);
    }
}
