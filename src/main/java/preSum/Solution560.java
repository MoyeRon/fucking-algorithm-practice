package preSum;

/**
 * @name: 和为 K 的子数组
 * @link: https://leetcode-cn.com/problems/subarray-sum-equals-k/
 * @author: taoyouwei
 * @date: 2021/10/21
 **/
public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int length = nums.length;
        int[] preSum = new int[length + 1];
        preSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int count = 0;
        for (int i = 0; i < preSum.length - 1; i++) {
            for (int j = i + 1; j < preSum.length; j++) {
                if (preSum[j] - preSum[i] == k) {
                    count++;
                }
            }
        }
        return count;

    }
}
