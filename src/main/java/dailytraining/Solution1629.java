package dailytraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @name: 按键持续时间最长的键
 * @link: https://leetcode-cn.com/problems/gray-code/
 * @author: taoyouwei
 * @date: 2022/1/9
 **/
public class Solution1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        Map<Character, Integer> key2Times = new HashMap<>();
        char[] keys = keysPressed.toCharArray();
        for (int i = 0; i < keys.length; i++) {
            int currentTime = i == 0 ? releaseTimes[i] : releaseTimes[i] - releaseTimes[i - 1];
            key2Times.put(keys[i], Math.max(key2Times.getOrDefault(keys[i], 0), currentTime));
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(key2Times.entrySet());
        list.sort((k1, k2) -> {
            if (k1.getValue() != k2.getValue()) {
                return k2.getValue() - k1.getValue();
            }
            return k2.getKey() - k1.getKey();
        });
        return list.get(0).getKey();
    }
}