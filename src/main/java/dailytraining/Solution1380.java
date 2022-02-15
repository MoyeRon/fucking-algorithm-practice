package dailytraining;

import java.util.LinkedList;
import java.util.List;

/**
 * @name: 矩阵中的幸运数
 * @link: https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/
 * @author: taoyouwei
 * @date: 2022/2/15
 **/
public class Solution1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            int pos = -1;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min) {
                    pos = j;
                    min = matrix[i][j];
                }
            }
            result[i][pos]++;
        }
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            int pos = -1;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > max) {
                    pos = i;
                    max = matrix[i][j];
                }
            }
            result[pos][j]++;
        }
        List<Integer> nums = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (result[i][j] == 2) {
                    nums.add(matrix[i][j]);
                }
            }
        }
        return nums;
    }
}
