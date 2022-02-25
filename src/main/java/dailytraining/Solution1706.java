package dailytraining;

/**
 * @name: 球会落何处
 * @link: https://leetcode-cn.com/problems/where-will-the-ball-fall/
 * @author: taoyouwei
 * @date: 2022/2/25
 **/
public class Solution1706 {
    public int[] findBall(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] result = new int[cols];
        for (int i = 0; i < cols; i++) {
            int current = i;
            for (int j = 0; j < rows; j++) {
                if (grid[j][current] == 1 && current + 1 < cols && grid[j][current + 1] == 1) {
                    current++;
                } else if (grid[j][current] == -1 && current - 1 >= 0 && grid[j][current - 1] == -1) {
                    current--;
                } else {
                    result[i] = -1;
                    break;
                }
            }
            if (result[i] != -1) {
                result[i] = current;
            }

        }
        return result;
    }
}
