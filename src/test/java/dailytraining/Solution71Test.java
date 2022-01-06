package dailytraining;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution71Test {
    @Test
    public void testSimplifyPath() {
        Solution71 solution71 = new Solution71();
        assertEquals("/c", solution71.simplifyPath("/a/./b/../../c/"));
        assertEquals("/home/foo", solution71.simplifyPath("/home//foo/"));
        assertEquals("/", solution71.simplifyPath("/../"));
        assertEquals("/home", solution71.simplifyPath("/home/"));
    }
}
