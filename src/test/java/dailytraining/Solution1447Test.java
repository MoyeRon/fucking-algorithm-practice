package dailytraining;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution1447Test {
    Solution1447 solution1447 = new Solution1447();

    @Test
    public void simplifiedFractions() {
        List<String> strings = solution1447.simplifiedFractions(4);
        System.out.println(strings);
    }
}