package slidingwindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @name: 字符串的排列
 * @link: https://leetcode-cn.com/problems/permutation-in-string/
 * @author: taoyouwei
 * @date: 2021/9/8
 **/
public class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        char[] targets = s1.toCharArray();
        char[] sources = s2.toCharArray();
        Map<Character, Integer> needsMap = new HashMap<>();
        Map<Character, Integer> windowsMap = new HashMap<>();
        for (char target : targets) {
            needsMap.put(target, needsMap.getOrDefault(target, 0) + 1);
        }
        int left = 0, right = 0;
        while (right < sources.length) {
            char source = sources[right];
            windowsMap.put(source, windowsMap.getOrDefault(source, 0) + 1);
            right++;
            while (isMapContains(needsMap, windowsMap)) {
                if (left == right) {
                    break;
                }
                if (needsMap.equals(windowsMap)) {
                    return true;
                } else {
                    char leftChar = sources[left];
                    int count = windowsMap.get(leftChar) - 1;
                    if (count == 0) {
                        windowsMap.remove(leftChar);
                    } else {
                        windowsMap.put(leftChar, count);
                    }
                }
                left++;
            }
        }
        return false;
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
