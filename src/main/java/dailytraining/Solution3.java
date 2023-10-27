package dailytraining;

import java.util.HashSet;
import java.util.Set;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/9/6
 **/
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        char[] chars = s.toCharArray();
        int maxLength = 0;
        int left = 0, right = 1;
        Set<Character> set = new HashSet<>();
        set.add(chars[left]);
        while (right < chars.length) {
            if (!set.contains(chars[right])) {
                set.add(chars[right]);
                maxLength = Math.max(maxLength, set.size());
                right++;
            } else {
                set.remove(chars[left]);
                left++;
            }
        }
        return maxLength;
    }
}
