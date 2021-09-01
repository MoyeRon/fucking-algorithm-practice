package backtrace;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution46Test {

    @Test
    public void permuteTest() {
        Solution46 solution46 = new Solution46();
        List<List<Integer>> permute = solution46.permute(new int[]{1, 2, 3});
        System.out.println(permute);
    }

}