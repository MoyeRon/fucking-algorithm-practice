package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1020Test {
    Solution1020 solution = new Solution1020();

    @Test
    public void numEnclavesCase1() {
        assertEquals(3, solution.numEnclaves(new int[][]{{0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}));
    }

    @Test
    public void numEnclavesCase2() {
        assertEquals(0, solution.numEnclaves(new int[][]{{0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}}));
    }
}