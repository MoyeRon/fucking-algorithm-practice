package binarySearch;

/**
 * @name: 在排序数组中查找元素的第一个和最后一个位置
 * @link: https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = leftBond(nums, target);
        if (result[0] == -1) {
            result[1] = -1;
            return result;
        }
        result[1] = rightBond(nums, target);
        return result;
    }

    public int leftBond(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                right = mid - 1;
            } else {
                right = mid - 1;
            }
        }
        if (left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    public int rightBond(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }
}
