package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution504Test {
    Solution504 solution = new Solution504();

    @Test
    public void convertToBase7Case1() {
        assertEquals("202", solution.convertToBase7(100));
    }

    @Test
    public void convertToBase7Case2() {
        assertEquals("-10", solution.convertToBase7(-7));
    }
}