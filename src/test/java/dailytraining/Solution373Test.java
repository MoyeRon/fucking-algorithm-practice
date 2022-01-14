package dailytraining;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution373Test {

    @Test
    public void kSmallestPairs() {
        Solution373 solution373 = new Solution373();
        List<List<Integer>> lists = solution373.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3);
        List<List<Integer>> lists1 = solution373.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2);
        List<List<Integer>> lists2 = solution373.kSmallestPairs(new int[]{1, 2}, new int[]{1}, 3);
        System.out.println();
    }
}