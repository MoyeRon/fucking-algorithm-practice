package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution322Test {

    Solution322 solution322 = new Solution322();

    @Test
    public void coinChangeTest() {
//        assertEquals(solution322.coinChange(new int[]{1, 2, 5}, 11), 3);
//        assertEquals(solution322.coinChange(new int[]{2}, 3), -1);
//        assertEquals(solution322.coinChange(new int[]{1}, 0), 0);
//        assertEquals(solution322.coinChange(new int[]{1}, 2), 2);
        assertEquals(solution322.coinChange(new int[]{1,2,5,10}, 27), 4);
    }
}