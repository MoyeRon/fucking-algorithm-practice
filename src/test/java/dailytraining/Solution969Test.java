package dailytraining;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution969Test {

    Solution969 solution969 = new Solution969();

    @Test
    public void pancakeSort() {
        List<Integer> list = solution969.pancakeSort(new int[]{1,2,3});
        System.out.println(list);
    }

    @Test
    public void reverse() {
        int[] nums = new int[]{3, 2, 4, 1};
        solution969.reverse(nums, 2);
        System.out.println(nums);
    }
}