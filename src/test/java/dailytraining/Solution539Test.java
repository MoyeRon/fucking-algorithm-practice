package dailytraining;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution539Test {
    Solution539 solution539 = new Solution539();

    @Test
    public void findMinDifference1() {
        List<String> times = new ArrayList<String>() {{
            add("23:59");
            add("00:00");
        }};
        assertEquals(1, solution539.findMinDifference(times));
    }

    @Test
    public void findMinDifference2() {
        List<String> times = new ArrayList<String>() {{
            add("23:59");
            add("00:00");
            add("00:00");
        }};
        assertEquals(0, solution539.findMinDifference(times));
    }
}