package dailytraining;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution1380Test {
    Solution1380 solution = new Solution1380();

    @Test
    public void luckyNumbers() {
        List<Integer> list = solution.luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}});
        System.out.println(list);
    }
}