package dailytraining;

/**
 * @name: 递增的三元子序列
 * @link: https://leetcode-cn.com/problems/increasing-triplet-subsequence/
 * @author: taoyouwei
 * @date: 2022/1/12
 **/
public class Solution334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int[] leftMin = new int[nums.length];
        int[] rightMax = new int[nums.length];
        leftMin[0] = nums[0];
        rightMax[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }
        for (int i = nums.length - 2; i > -1; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftMin[i] < nums[i] && nums[i] < rightMax[i]) {
                return true;
            }
        }
        return false;
    }
}
