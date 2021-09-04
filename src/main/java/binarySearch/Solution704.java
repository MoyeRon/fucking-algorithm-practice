package binarySearch;

/**
 * @name: 二分查找
 * @link: https://leetcode-cn.com/problems/binary-search/
 * @author: taoyouwei
 * @date: 2021/9/4
 **/
public class Solution704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
