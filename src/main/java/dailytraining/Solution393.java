package dailytraining;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @name: UTF-8 编码验证
 * @link: https://leetcode-cn.com/problems/utf-8-validation/
 * @author: taoyouwei
 * @date: 2022/3/13
 **/
public class Solution393 {
    public boolean validUtf8(int[] data) {
        int n = data.length;
        for (int i = 0; i < n; ) {
            int t = data[i], j = 7;
            while (j >= 0 && (((t >> j) & 1) == 1)) j--;
            int cnt = 7 - j;
            if (cnt == 1 || cnt > 4) return false;
            if (i + cnt - 1 >= n) return false;
            for (int k = i + 1; k < i + cnt; k++) {
                if ((((data[k] >> 7) & 1) == 1) && (((data[k] >> 6) & 1) == 0)) continue;
                return false;
            }
            if (cnt == 0) i++;
            else i += cnt;
        }
        return true;
    }


}
