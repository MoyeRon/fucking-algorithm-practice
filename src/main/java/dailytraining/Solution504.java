package dailytraining;

/**
 * @name: 七进制数
 * @link: https://leetcode-cn.com/problems/base-7/
 * @author: taoyouwei
 * @date: 2022/3/7
 **/
public class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        String flag = num < 0 ? "-" : "";
        num = Math.abs(num);
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            int current = num % 7;
            result.insert(0, current);
            num = num / 7;
        }
        return flag + result;
    }
}
