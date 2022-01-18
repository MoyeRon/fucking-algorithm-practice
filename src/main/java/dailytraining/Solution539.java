package dailytraining;

import java.util.Comparator;
import java.util.List;

/**
 * @name: 最小时间差
 * @link: https://leetcode-cn.com/problems/minimum-time-difference/
 * @author: taoyouwei
 * @date: 2022/1/18
 **/
public class Solution539 {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) {
            return 0;
        }
        timePoints.sort(Comparator.comparingInt(this::getMinus));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < timePoints.size() - 1; i++) {
            min = Math.min(min, getMinus(timePoints.get(i + 1)) - getMinus(timePoints.get(i)));
        }
        min = Math.min(min, (getMinus(timePoints.get(0)) + 1440 - getMinus(timePoints.get(timePoints.size() - 1))) % 1440);
        return min;
    }

    private int getMinus(String time) {
        String[] strings = time.split(":");
        return Integer.parseInt(strings[0]) * 60 + Integer.parseInt(strings[1]);
    }
}
