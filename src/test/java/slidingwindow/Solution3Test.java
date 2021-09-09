package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution3Test {
    Solution3 solution3 = new Solution3();

    @Test
    public void lengthOfLongestSubstringTest() {
        assertEquals(solution3.lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(solution3.lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(solution3.lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(solution3.lengthOfLongestSubstring("aabaab!bb"), 3);
    }
}