package dailytraining;

import java.util.HashMap;
import java.util.Map;

/**
 * @name: 差的绝对值为 K 的数对数目
 * @link: https://leetcode-cn.com/problems/count-number-of-pairs-with-absolute-difference-k/
 * @author: taoyouwei
 * @date: 2022/2/9
 **/
public class Solution2006 {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> num2Times = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            count += num2Times.getOrDefault(num - k, 0) + num2Times.getOrDefault(num + k, 0);
            num2Times.put(num, num2Times.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
