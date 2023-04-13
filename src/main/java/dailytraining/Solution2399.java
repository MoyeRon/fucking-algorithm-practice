package dailytraining;

import java.util.HashMap;
import java.util.Map;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/4/9
 **/
public class Solution2399 {
    public boolean checkDistances(String s, int[] distance) {
        Map<Character, Integer> posMaps = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (posMaps.containsKey(chars[i])) {
                int dist = i - posMaps.get(chars[i]) - 1;
                if (distance[chars[i] - 'a'] != dist) {
                    return false;
                }
            } else {
                posMaps.put(chars[i], i);
            }
        }
        return true;
    }
}
