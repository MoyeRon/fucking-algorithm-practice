package dailytraining;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1716Test {


    @Test
    public void testTotalMoney() {
        Solution1716 solution1716 = new Solution1716();

        assertEquals(10, solution1716.totalMoney(4));
        assertEquals(37, solution1716.totalMoney(10));
        assertEquals(96, solution1716.totalMoney(20));

    }
}