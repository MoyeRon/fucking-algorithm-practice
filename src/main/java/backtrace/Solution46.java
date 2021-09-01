package backtrace;

import java.util.LinkedList;
import java.util.List;

/**
 * @name: 全排列
 * @link: https://leetcode-cn.com/problems/permutations/
 * @author: taoyouwei
 * @date: 2021/9/1
 **/
public class Solution46 {

    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> selected = new LinkedList<>();
        backTrace(selected, nums);
        return result;
    }

    public void backTrace(LinkedList<Integer> selected, int[] nums) {
        if (selected.size() == nums.length) {
            result.add(new LinkedList<>(selected));
            return;
        }
        for (int num : nums) {
            if (selected.contains(num)) {
                continue;
            }
            selected.add(num);
            backTrace(selected, nums);
            selected.removeLast();
        }
    }
}
