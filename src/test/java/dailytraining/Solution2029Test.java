package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2029Test {
    Solution2029 solution2029 = new Solution2029();

    @Test
    public void stoneGameIX1() {
        assertEquals(true, solution2029.stoneGameIX(new int[]{2, 1}));
    }

    @Test
    public void stoneGameIX2() {
        assertEquals(false, solution2029.stoneGameIX(new int[]{2}));
    }

    @Test
    public void stoneGameIX3() {
        assertEquals(false, solution2029.stoneGameIX(new int[]{5, 1, 2, 4, 3}));
    }

    @Test
    public void stoneGameIX4() {
        assertEquals(true, solution2029.stoneGameIX(new int[]{20, 3, 20, 17, 2, 12, 15, 17, 4}));
    }

    @Test
    public void stoneGameIX5() {
        assertEquals(true, solution2029.stoneGameIX(new int[]{1, 1, 7, 10, 8, 17, 10, 20, 2, 10}));
    }
}