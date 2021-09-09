package slidingwindow;

import java.util.*;

/**
 * @name: 找到字符串中所有字母异位词
 * @link: https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 * @author: taoyouwei
 * @date: 2021/9/8
 **/
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        char[] sources = s.toCharArray();
        char[] targets = p.toCharArray();
        Map<Character, Integer> needsMap = new HashMap<>();
        Map<Character, Integer> windowsMap = new HashMap<>();
        List<Integer> result = new LinkedList<>();
        int left = 0, right = 0;
        for (char target : targets) {
            needsMap.put(target, needsMap.getOrDefault(target, 0) + 1);
        }
        while (right < sources.length) {
            char source = sources[right];
            windowsMap.put(source, windowsMap.getOrDefault(source, 0) + 1);
            right++;
            while (isMapContains(needsMap, windowsMap)) {
                if (left == right) {
                    break;
                }
                if (needsMap.equals(windowsMap)) {
                    result.add(left);
                    break;
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
