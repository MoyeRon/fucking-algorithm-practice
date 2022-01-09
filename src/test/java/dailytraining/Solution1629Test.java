package dailytraining;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution1629Test {

    @Test
    public void testSlowestKey() {
        Solution1629 solution1629 = new Solution1629();
        // assertEquals('a', solution1629.slowestKey(new int[]{12,23,36,46,62}, "spuda"));
        assertEquals('c', solution1629.slowestKey(new int[]{9,29,49,50}, "cbcd"));

    }
}
