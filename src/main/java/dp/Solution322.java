package dp;

/**
 * @name: 零钱兑换
 * @link: https://leetcode-cn.com/problems/coin-change/
 * @author: taoyouwei
 * @date: 2021/9/1
 **/
public class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] nums = new int[amount + 1];
        for (int coin : coins) {
            if (coin <= amount) {
                nums[coin] = 1;
            }
        }
        for (int i = 1; i < amount + 1; i++) {
            if (nums[i] == 1) {
                continue;
            }
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                int preCoin = i - coin;
                if (preCoin < 0 || nums[preCoin] == -1) {
                    continue;
                }
                min = Math.min(min, nums[preCoin]);
            }
            nums[i] = min == Integer.MAX_VALUE ? -1 : min + 1;
        }
        return nums[amount];
    }
}
