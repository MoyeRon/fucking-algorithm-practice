package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution76Test {

    @Test
    public void minWindow() {
        Solution76 solution76 = new Solution76();
        String string = solution76.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(string);
    }
}