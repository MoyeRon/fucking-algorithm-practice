package dailytraining;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/4/6
 **/
public class Solution1017 {
    public String baseNeg2(int n) {
        if (n == 0 || n == 1) {
            return String.valueOf(n);
        }
        StringBuilder result = new StringBuilder();
        int sep = -2;
        while (n != 0) {
            int remain = n & 1;
            result.append(remain);
            n -= remain;
            n /= -2;
        }
        return result.reverse().toString();
    }
}
