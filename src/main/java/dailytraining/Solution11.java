package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/9/5
 **/
public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int cap = 0;
        while (left != right) {
            int h = Math.min(height[left], height[right]);
            cap = Math.max((right - left) * h, cap);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return cap;
    }
}
