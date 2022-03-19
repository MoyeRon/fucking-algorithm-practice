package contest;

import java.util.HashMap;
import java.util.Map;

/**
 * @name: 将数组划分成相等数对
 * @link:
 * @author: taoyouwei
 * @date: 2022/3/19
 **/
public class Solution6020 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> numsToTimesMap = new HashMap<>();
        for (int num : nums) {
            numsToTimesMap.put(num, numsToTimesMap.getOrDefault(num, 0) + 1);
        }
        return numsToTimesMap.values().stream().allMatch(num -> num % 2 == 0);
    }
}
