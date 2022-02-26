package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2016Test {

    Solution2016 solution2016 = new Solution2016();

    @Test
    public void maximumDifferenceCase1() {
        assertEquals(4, solution2016.maximumDifference(new int[]{7, 1, 5, 4}));
    }

    @Test
    public void maximumDifferenceCase2() {
        assertEquals(-1, solution2016.maximumDifference(new int[]{9, 4, 3, 2}));
    }

    @Test
    public void maximumDifferenceCase3() {
        assertEquals(9, solution2016.maximumDifference(new int[]{1,5,2,10}));
    }
}