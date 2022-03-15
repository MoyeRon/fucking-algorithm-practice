package dailytraining;

import java.util.*;

/**
 * @name: 统计按位或能得到最大值的子集数目
 * @link: https://leetcode-cn.com/problems/count-number-of-maximum-bitwise-or-subsets/
 * @author: taoyouwei
 * @date: 2022/3/15
 **/
public class Solution2044 {
    public int countMaxOrSubsets(int[] nums) {
        TreeMap<Integer, Integer> maxMap = new TreeMap<>();
        List<Integer> selected = new LinkedList<>();
        int current = 0;
        backtrack(maxMap, selected, nums, current, 0);
        return maxMap.lastEntry().getValue();
    }

    public void backtrack(TreeMap<Integer, Integer> maxMap, List<Integer> selected, int[] nums, int currentValue, int currentIndex) {
        for (int i = currentIndex; i < nums.length; i++) {
            if (selected.contains(i)) {
                continue;
            }
            selected.add(i);
            int newCurrent = currentValue | nums[i];
            maxMap.put(newCurrent, maxMap.getOrDefault(newCurrent, 0) + 1);
            backtrack(maxMap, selected, nums, newCurrent, i);
            selected.remove(selected.size() - 1);
        }
    }
}
