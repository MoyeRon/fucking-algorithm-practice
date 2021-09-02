package bfs;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Solution752Test {
    Solution752 solution752 = new Solution752();


    @Test
    public void nextPasswordTest() {
        List<String> strings = solution752.nextPassword("9999");
        System.out.println(strings);
    }

    @Test
    public void openLockTest() {
        assertEquals(solution752.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"), 6);
        assertEquals(solution752.openLock(new String[]{"8888"}, "0009"), 1);
        assertEquals(solution752.openLock(new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"}, "8888"), -1);
        assertEquals(solution752.openLock(new String[]{"0000"}, "0000"), -1);

    }
}