package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1332Test {
    Solution1332 solution1332 = new Solution1332();

    @Test
    public void removePalindromeSub1() {
        assertEquals(1, solution1332.removePalindromeSub("ababa"));
    }

    @Test
    public void removePalindromeSub2() {
        assertEquals(2, solution1332.removePalindromeSub("abb"));
    }

    @Test
    public void removePalindromeSub3() {
        assertEquals(2, solution1332.removePalindromeSub("baabb"));
    }

    @Test
    public void removePalindromeSub4() {
        assertEquals(2, solution1332.removePalindromeSub("abbaaaab"));
    }
}