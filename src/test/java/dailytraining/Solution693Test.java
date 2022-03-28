package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution693Test {
    Solution693 solution = new Solution693();

    @Test
    public void hasAlternatingBits() {
        assertEquals(true, solution.hasAlternatingBits(5));
        assertEquals(false, solution.hasAlternatingBits(7));

    }
}