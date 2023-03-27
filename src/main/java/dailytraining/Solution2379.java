package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/27
 **/
public class Solution2379 {
    public int minimumRecolors(String blocks, int k) {
        char[] chars = blocks.toCharArray();
        int wNums = 0;
        for (int i = 0; i < k; i++) {
            if (chars[i] == 'W') {
                wNums++;
            }
        }
        int min = wNums;
        for (int i = k; i < chars.length; i++) {
            if (chars[i] == 'W') {
                wNums++;
            }
            if (chars[i - k] == 'W') {
                wNums--;
            }
            min = Math.min(min, wNums);
        }
        return min;
    }
}
