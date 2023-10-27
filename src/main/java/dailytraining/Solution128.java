package dailytraining;

import java.util.HashSet;
import java.util.Set;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/9/6
 **/
public class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        Integer[] array = set.toArray(new Integer[0]);
        for (Integer i : array) {
            if (!set.contains(i - 1)) {
                int current = i;
                int currentLength = 1;
                while (set.contains(current + 1)) {
                    current++;
                    currentLength++;
                }
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        return maxLength;
    }
}
