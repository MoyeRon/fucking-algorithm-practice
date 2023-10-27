package dailytraining;

import java.util.*;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/9/7
 **/
public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() == 1) {
            return s.equals(p) ? Collections.singletonList(0) : new ArrayList<>();
        }
        if (s.length() < p.length()) {
            return new ArrayList<>();
        }
        char[] ps = p.toCharArray();
        Map<Character, Integer> target = new HashMap<>();
        for (char c : ps) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> source = new HashMap<>();
        char[] sources = s.toCharArray();
        int left = 0, right = p.length() - 1;
        for (int i = 0; i < right; i++) {
            source.put(sources[i], source.getOrDefault(sources[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        while (right < sources.length) {
            source.put(sources[right], source.getOrDefault(sources[right], 0) + 1);
            right++;
            if (source.equals(target)) {
                result.add(left);
            }
            int current = source.get(sources[left]) - 1;
            if (current == 0) {
                source.remove(sources[left]);
            } else {
                source.put(sources[left], current);
            }
            left++;
        }
        return result;
    }
}
