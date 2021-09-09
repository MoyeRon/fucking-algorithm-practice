package slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @name: 无重复字符的最长子串
 * @link: https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @author: taoyouwei
 * @date: 2021/9/8
 **/
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        char[] sources = s.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();
        int left = 0, right = 0;
        int max = 0;
        while (right < sources.length) {
            char c = sources[right];
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            right++;
            while (countMap.get(c) > 1) {
                char l = sources[left];
                countMap.put(l, countMap.get(l) - 1);
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
