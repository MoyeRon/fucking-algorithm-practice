package dailytraining;

import java.util.*;

/**
 * @name: 最简分数
 * @link: https://leetcode-cn.com/problems/simplified-fractions/
 * @author: taoyouwei
 * @date: 2022/2/10
 **/
public class Solution1447 {

    private Set<Integer> primeNums = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97));

    public List<String> simplifiedFractions(int n) {
        if (n == 1) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                if (primeNums.contains(i)) {
                    res.add(j + "/" + i);
                } else if (gcd(i, j) == 1) {
                    res.add(j + "/" + i);
                }

            }
        }
        return res;
    }

    public int gcd(int m, int n) {

        if (m == 0 || n == 0) {
            return 1;
        }
        if (m % n == 0) {
            return n;
        }
        return gcd(n, m % n);
    }
}
