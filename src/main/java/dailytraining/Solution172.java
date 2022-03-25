package dailytraining;

/**
 * @name: 阶乘后的零
 * @link: https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 * @author: taoyouwei
 * @date: 2022/3/25
 **/
public class Solution172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            count += (n / 5);
            n = n / 5;
        }
        return count;
    }
}
