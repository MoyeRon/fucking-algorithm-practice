package slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @name: 最小覆盖子串
 * @link: https://leetcode-cn.com/problems/minimum-window-substring/
 * @author: taoyouwei
 * @date: 2021/9/6
 **/
public class Solution76 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> needsMap = new HashMap<>();
        Map<Character, Integer> windowsMap = new HashMap<>();
        int valid = Integer.MAX_VALUE;
        String result = "";
        char[] targets = t.toCharArray();
        char[] sources = s.toCharArray();
        for (char target : targets) {
            if (needsMap.containsKey(target)) {
                needsMap.compute(target, (k, v) -> v = v + 1);
            } else {
                needsMap.put(target, 1);
            }
        }
        int left = 0, right = 0;
        while (right < sources.length) {
            if (windowsMap.containsKey(sources[right])) {
                windowsMap.compute(sources[right], (k, v) -> v = v + 1);
            } else {
                windowsMap.put(sources[right], 1);
            }
            right++;
            while (isMapContains(needsMap, windowsMap)) {
                if (right - left < valid) {
                    valid = right - left;
                    result = String.copyValueOf(sources, left, valid);
                }
                char c = sources[left];
                windowsMap.compute(c, (k, v) -> v = v - 1);
                left++;
            }
        }
        return result;
    }

    public boolean isMapContains(Map<Character, Integer> needsMap, Map<Character, Integer> windowsMap) {
        Set<Character> characters = needsMap.keySet();
        for (Character c : characters) {
            if (!windowsMap.containsKey(c) || needsMap.get(c) > (windowsMap.get(c))) {
                return false;
            }
        }
        return true;
    }
}
