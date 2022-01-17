package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1220Test {

    @Test
    public void countVowelPermutation() {
        Solution1220 solution1220 = new Solution1220();
        assertEquals(5, solution1220.countVowelPermutation(1));
        assertEquals(10, solution1220.countVowelPermutation(2));
        assertEquals(68, solution1220.countVowelPermutation(5));
        assertEquals(18208803, solution1220.countVowelPermutation(144));
    }
}