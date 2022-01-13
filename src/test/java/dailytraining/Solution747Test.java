package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution747Test {

    @Test
    public void dominantIndex() {
        Solution747 solution747 = new Solution747();
        assertEquals(1, solution747.dominantIndex(new int[]{3, 6, 1, 0}));
        assertEquals(-1, solution747.dominantIndex(new int[]{1, 2, 3, 4}));
        assertEquals(0, solution747.dominantIndex(new int[]{1}));

    }
}