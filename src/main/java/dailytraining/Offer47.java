package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/27
 **/
public class Offer47 {
    public int maxValue(int[][] grid) {
        int[][] sums = new int[grid.length][grid[0].length];
        sums[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            sums[i][0] = sums[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < grid[0].length; i++) {
            sums[0][i] = sums[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                sums[i][j] = Math.max(sums[i - 1][j], sums[i][j - 1]) + grid[i][j];
            }
        }
        return sums[grid.length - 1][grid[0].length - 1];
    }
}
