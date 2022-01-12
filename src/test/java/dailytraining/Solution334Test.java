package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution334Test {

    @Test
    public void increasingTriplet() {
        Solution334 solution334 = new Solution334();
        assertEquals(true, solution334.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertEquals(false, solution334.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertEquals(true, solution334.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));

    }
}