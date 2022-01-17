package dailytraining;

import java.util.ArrayList;
import java.util.List;

/**
 * @name: 格雷编码
 * @link: https://leetcode-cn.com/problems/gray-code/
 * @author: taoyouwei
 * @date: 2022/1/8
 **/
public class Solution89 {

    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            ret.add((i >> 1) ^ i);
        }
        return ret;

    }

}
