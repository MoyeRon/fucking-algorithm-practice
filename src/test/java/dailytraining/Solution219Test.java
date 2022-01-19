package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution219Test {
    Solution219 solution219 = new Solution219();

    @Test
    public void containsNearbyDuplicate() {
        assertEquals(true, solution219.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }
}