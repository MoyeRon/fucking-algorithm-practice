package dailytraining;

import java.util.HashSet;
import java.util.Set;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/26
 **/
public class Solution2395 {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> sums = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (sums.contains(nums[i] + nums[i + 1])) {
                return true;
            } else {
                sums.add(nums[i] + nums[i + 1]);
            }
        }
        return false;
    }
}
