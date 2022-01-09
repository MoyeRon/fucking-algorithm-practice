package dailytraining;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class Solution89Test {
    Solution89 solution89 = new Solution89();

    @Test
    public void testBackTrace() {
        List<Integer> grayCode = solution89.grayCode(6);
        System.out.println(grayCode);
    }
}
