package dailytraining;

import java.util.Arrays;

/**
 * @name: 学生分数的最小差值
 * @link: https://leetcode-cn.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 * @author: taoyouwei
 * @date: 2022/2/11
 **/
public class Solution1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = k - 1;
        int min = Integer.MAX_VALUE;
        for (; j < nums.length; j++, i++) {
            min = Math.min(min, nums[j] - nums[i]);
        }
        return min;
    }
}
