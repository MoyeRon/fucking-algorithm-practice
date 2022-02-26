package dailytraining;

/**
 * @name: 增量元素之间的最大差值
 * @link: https://leetcode-cn.com/problems/maximum-difference-between-increasing-elements/
 * @author: taoyouwei
 * @date: 2022/2/26
 **/
public class Solution2016 {
    public int maximumDifference(int[] nums) {
        int[] preMin = new int[nums.length];
        preMin[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            preMin[i] = Math.min(nums[i], preMin[i - 1]);
        }
        int maxMin = -1;
        for (int i = 0; i < nums.length; i++) {
            if (preMin[i] < nums[i]) {
                maxMin = Math.max(maxMin, nums[i] - preMin[i]);
            }
        }
        return maxMin;
    }
}
