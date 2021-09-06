package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution76Test {

    Solution76 solution76 = new Solution76();

    @Test
    public void minWindowTest() {
        assertEquals(solution76.minWindow("ADOBECODEBANC", "ABC"), "BANC");
        assertEquals(solution76.minWindow("a", "a"), "a");
        assertEquals(solution76.minWindow("a", "aa"), "");
    }
}