package dailytraining;

/**
 * @name: 将一维数组转变成二维数组
 * @link: https://leetcode-cn.com/problems/convert-1d-array-into-2d-array/
 * @author: taoyouwei
 * @date: 2022/1/7
 **/
public class Solution2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        int i = 0, j = 0;
        for (int num : original) {
            result[i][j] = num;
            j++;
            if (j >= n) {
                i++;
                j = 0;
            }
        }
        return result;
    }
}
