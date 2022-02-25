package dailytraining;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @name: 煎饼排序
 * @link: https://leetcode-cn.com/problems/pancake-sorting/
 * @author: taoyouwei
 * @date: 2022/2/25
 **/
public class Solution969 {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new LinkedList<>();
        int right = arr.length - 1;
        while (!isSorted(arr, right)) {
            int pos = maxPosition(arr, right);
            result.add(pos + 1);
            reverse(arr, pos);
            result.add(right + 1);
            reverse(arr, right);
            right--;
        }
        return result;
    }

    public boolean isSorted(int[] arr, int right) {

        for (int i = 0; i < right; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    public int maxPosition(int[] arr, int right) {
        int max = Integer.MIN_VALUE;
        int pos = -1;
        for (int i = 0; i <= right; i++) {
            if (arr[i] > max) {
                pos = i;
                max = arr[i];
            }
        }
        return pos;
    }

    public void reverse(int[] arr, int right) {
        int[] nums = Arrays.copyOf(arr, right + 1);
        for (int i = 0; i <= right; i++) {
            arr[i] = nums[right - i];
        }
    }

}
