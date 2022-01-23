package dailytraining;

/**
 * @name: 删除回文子序列
 * @link: https://leetcode-cn.com/problems/remove-palindromic-subsequences/
 * @author: taoyouwei
 * @date: 2022/1/22
 **/
public class Solution1332 {
    public int removePalindromeSub(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; ++i) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 2;
            }
        }
        return 1;
    }

}
