package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution537Test {
    Solution537 solution537 = new Solution537();

    @Test
    public void complexNumberMultiplyCase1() {
        assertEquals("0+2i", solution537.complexNumberMultiply("1+1i", "1+1i"));
    }

    @Test
    public void complexNumberMultiplyCase2() {
        assertEquals("0+-2i", solution537.complexNumberMultiply("1+-1i", "1+-1i"));
    }
}