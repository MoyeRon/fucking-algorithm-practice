package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution393Test {
    Solution393 solution = new Solution393();

    @Test
    public void validUtf8() {
        assertEquals(true, solution.validUtf8(new int[]{197, 130, 1}));
        assertEquals(false, solution.validUtf8(new int[]{235, 140, 4}));
        assertEquals(false, solution.validUtf8(new int[]{255}));
        assertEquals(false, solution.validUtf8(new int[]{145}));
        assertEquals(true, solution.validUtf8(new int[]{230,136,145}));

    }

}