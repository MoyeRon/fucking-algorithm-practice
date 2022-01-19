package dailytraining;

import java.util.HashMap;
import java.util.Map;

/**
 * @name: 存在重复元素 II
 * @link: https://leetcode-cn.com/problems/contains-duplicate-ii/
 * @author: taoyouwei
 * @date: 2022/1/19
 **/
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numToIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndexes.containsKey(nums[i])) {
                int oldIndex = numToIndexes.get(nums[i]);
                if (i - oldIndex <= k) {
                    return true;
                }
                numToIndexes.put(nums[i], i);
            } else {
                numToIndexes.put(nums[i], i);
            }
        }
        return false;
    }
}
