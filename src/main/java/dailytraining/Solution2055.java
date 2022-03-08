package dailytraining;

/**
 * @name: 蜡烛之间的盘子
 * @link: https://leetcode-cn.com/problems/plates-between-candles/
 * @author: taoyouwei
 * @date: 2022/3/8
 **/
public class Solution2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        char[] tables = s.toCharArray();
        int[] plates = new int[tables.length];
        int plateSum = 0;
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] == '*') {
                plateSum++;
            }
            plates[i] = plateSum;
        }
        int[] left = new int[tables.length];
        for (int i = 0, l = -1; i < tables.length; i++) {
            if (s.charAt(i) == '|') {
                l = i;
            }
            left[i] = l;
        }
        int[] right = new int[tables.length];
        for (int i = tables.length - 1, r = -1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                r = i;
            }
            right[i] = r;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int x = right[query[0]], y = left[query[1]];
            ans[i] = x == -1 || y == -1 || x >= y ? 0 : plates[y] - plates[x];
        }
        return ans;


    }
}
