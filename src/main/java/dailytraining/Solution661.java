package dailytraining;

/**
 * @name: 图片平滑器
 * @link: https://leetcode-cn.com/problems/image-smoother/
 * @author: taoyouwei
 * @date: 2022/3/24
 **/
public class Solution661 {
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int count = 0;
                int sum = 0;
                if (i - 1 >= 0 && j - 1 >= 0) {
                    count++;
                    sum += img[i - 1][j - 1];
                }
                if (i - 1 >= 0) {
                    count++;
                    sum += img[i - 1][j];
                }
                if (i - 1 >= 0 && j + 1 < cols) {
                    count++;
                    sum += img[i - 1][j + 1];
                }
                if (j - 1 >= 0) {
                    count++;
                    sum += img[i][j - 1];
                }
                count++;
                sum += img[i][j];
                if (j + 1 < cols) {
                    count++;
                    sum += img[i][j + 1];
                }
                if (i + 1 < rows && j - 1 >= 0) {
                    count++;
                    sum += img[i + 1][j - 1];
                }
                if (i + 1 < rows) {
                    count++;
                    sum += img[i + 1][j];
                }
                if (i + 1 < rows && j + 1 < cols) {
                    count++;
                    sum += img[i + 1][j + 1];
                }
                result[i][j] = sum / count;
            }
        }
        return result;
    }
}
