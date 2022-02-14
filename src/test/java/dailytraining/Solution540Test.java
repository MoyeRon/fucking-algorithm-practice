package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution540Test {
    Solution540 solution540 = new Solution540();

    @Test
    public void singleNonDuplicateCase1() {
        assertEquals(2, solution540.singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));

    }

    @Test
    public void singleNonDuplicateCase2() {
        assertEquals(7, solution540.singleNonDuplicate(new int[]{1, 1, 3, 3, 4, 4, 7, 8, 8}));

    }

    @Test
    public void singleNonDuplicateCase3() {
        assertEquals(10, solution540.singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11}));

    }

    @Test
    public void singleNonDuplicateCase4() {
        assertEquals(5, solution540.singleNonDuplicate(new int[]{3, 3, 5, 7, 7, 11, 11}));
    }

    @Test
    public void singleNonDuplicateCase5() {
        assertEquals(2, solution540.singleNonDuplicate(new int[]{2, 3, 3, 7, 7, 11, 11}));
    }
}