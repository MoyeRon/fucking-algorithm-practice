package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution172Test {
    Solution172 solution = new Solution172();

    @Test
    public void trailingZeroes() {
        assertEquals(0,solution.trailingZeroes(3));
        assertEquals(6,solution.trailingZeroes(25));
    }
}