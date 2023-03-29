package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/29
 **/
public class Solution1641 {
    public int countVowelStrings(int n) {
        int[][] nums = new int[5][n];
        for (int i = 0; i < 5; i++) {
            nums[i][0] = 1;
        }
        for (int j = 1; j < n; j++) {
            for (int i = 4; i >= 0; i--) {
                if (i == 4) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i + 1][j] + nums[i][j - 1];
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += nums[i][n - 1];
        }
        return sum;
    }
}
