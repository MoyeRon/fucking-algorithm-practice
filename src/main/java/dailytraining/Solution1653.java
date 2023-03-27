package dailytraining;

import java.util.Arrays;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/27
 **/
public class Solution1653 {
    public int minimumDeletions(String s) {
        char[] chars = s.toCharArray();
        int leftB = 0;
        int rightA = 0;
        int maxB = 0;
        for (char c : chars) {
            if (c == 'a') {
                rightA++;
            }
            if (c == 'b') {
                maxB++;
            }
        }
        int min = Math.min(rightA, maxB);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') {
                rightA--;
            } else {
                leftB++;
            }
            min = Math.min(min, leftB + rightA);
        }
        return min;
    }
}
