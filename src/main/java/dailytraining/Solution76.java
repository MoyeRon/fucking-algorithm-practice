package dailytraining;

import java.util.HashMap;
import java.util.Map;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/10/31
 **/
public class Solution76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        String result = "";
        int min = Integer.MAX_VALUE;
        char[] sources = s.toCharArray();
        int left = 0;
        int right = 0;
        Map<Character, Integer> sourcesMap = new HashMap<>();
        while (right < sources.length) {
            sourcesMap.put(sources[right], sourcesMap.getOrDefault(sources[right], 0) + 1);
            right++;
            while (left < right && containMaps(sourcesMap, target)) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    result = s.substring(left, right);
                }
                sourcesMap.put(sources[left], sourcesMap.get(sources[left]) - 1);
                left++;
            }
        }
        return result;
    }

    private boolean containMaps(Map<Character, Integer> source, Map<Character, Integer> target) {
        for (Map.Entry<Character, Integer> entry : target.entrySet()) {
            if (!source.containsKey(entry.getKey())) {
                return false;
            }
            if (source.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }
}
