package dailytraining;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution1614Test {
    @Test
    public void testMaxDepth() {
        Solution1614 solution1614 = new Solution1614();
        assertEquals(3, solution1614.maxDepth("(1+(2*3)+((8)/4))+1"));
        assertEquals(3, solution1614.maxDepth("(1)+((2))+(((3)))"));
        assertEquals(1, solution1614.maxDepth("1+(2*3)/(2-1)"));
        assertEquals(0, solution1614.maxDepth("1"));

    }
}
