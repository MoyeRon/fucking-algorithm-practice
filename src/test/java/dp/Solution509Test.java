package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution509Test {
    Solution509 solution509 = new Solution509();

    @Test
    public void fibTest() {
        assertEquals(solution509.fib(2), 1);
        assertEquals(solution509.fib(3), 2);
    }
}
