package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2044Test {
    Solution2044 solution2044 = new Solution2044();

    @Test
    public void countMaxOrSubsetsCase1() {
        assertEquals(2, solution2044.countMaxOrSubsets(new int[]{3, 1}));
    }

    @Test
    public void countMaxOrSubsetsCase2() {
        assertEquals(7, solution2044.countMaxOrSubsets(new int[]{2, 2, 2}));
    }

    @Test
    public void countMaxOrSubsetsCase3() {
        assertEquals(6, solution2044.countMaxOrSubsets(new int[]{3,2,1,5}));
    }
}