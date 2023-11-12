package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/10/31
 **/
public class Solution53_1 {
    public int maxSubArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (result[i - 1] < 0) {
                result[i] = nums[i];
            } else {
                result[i] = result[i - 1] + nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < result.length; i++) {
            max = Math.max(max, result[i]);
        }
        return max;
    }
}
