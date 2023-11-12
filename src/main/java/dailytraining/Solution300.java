package dailytraining;

import java.util.stream.IntStream;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/11/12
 **/
public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, result[j]);
                }
            }
            result[i] = max + 1;
        }
        return IntStream.of(result).max().getAsInt();
    }
}
