package dp;

/**
 * @name: 斐波那契数列
 * @link: https://leetcode-cn.com/problems/fibonacci-number/
 * @author: taoyouwei
 * @date: 2021/9/1
 **/
public class Solution509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }
}
