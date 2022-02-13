package dailytraining;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @name: “气球” 的最大数量
 * @link: https://leetcode-cn.com/problems/maximum-number-of-balloons/
 * @author: taoyouwei
 * @date: 2022/2/13
 **/
public class Solution1189 {

    private Map<Character, Integer> targetMap = new HashMap<Character, Integer>() {{
        put('b', 1);
        put('a', 1);
        put('l', 2);
        put('o', 2);
        put('n', 1);
    }};

    public int maxNumberOfBalloons(String text) {
        if (text.length() < 7) {
            return 0;
        }
        Map<Character, Integer> timesMap = new HashMap<>();
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (targetMap.containsKey(c)) {
                timesMap.put(c, timesMap.getOrDefault(c, 0) + 1);
            }
        }
        AtomicInteger count = new AtomicInteger(Integer.MAX_VALUE);
        timesMap.forEach((k, v) -> {
            count.set(Math.min(count.get(), v / targetMap.get(k)));
        });
        return count.get();
    }
}
