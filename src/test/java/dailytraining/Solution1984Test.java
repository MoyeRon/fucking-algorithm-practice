package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1984Test {

    Solution1984 solution = new Solution1984();

    @Test
    public void minimumDifferenceCase1() {
        assertEquals(0, solution.minimumDifference(new int[]{90}, 1));
    }

    @Test
    public void minimumDifferenceCase2() {
        assertEquals(2, solution.minimumDifference(new int[]{9,4,1,7}, 2));
    }
}