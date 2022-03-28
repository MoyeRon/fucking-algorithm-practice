package dailytraining;

/**
 * @name: 交替位二进制数
 * @link: https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 * @author: taoyouwei
 * @date: 2022/3/28
 **/
public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        int pre = -1;
        while (n != 0) {
            int cur = n % 2;
            if (cur == pre) {
                return false;
            }
            pre = cur;
            n = n / 2;
        }
        return true;
    }
}
