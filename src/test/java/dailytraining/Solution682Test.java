package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution682Test {

    Solution682 solution = new Solution682();

    @Test
    public void calPointsCase() {
        assertEquals(30, solution.calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }
}