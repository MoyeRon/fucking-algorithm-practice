package slidingwindow;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution567Test {
    Solution567 solution567 = new Solution567();

    @Test
    public void checkInclusionTest() {
        assertEquals(solution567.checkInclusion("ab", "eidbaooo"), true);
        assertEquals(solution567.checkInclusion("ab", "eidboaoo"), false);
    }
}