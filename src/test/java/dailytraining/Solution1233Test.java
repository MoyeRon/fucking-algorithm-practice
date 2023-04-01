package dailytraining;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution1233Test {

    @Test
    public void removeSubfolders() {
        Solution1233 solution1233 = new Solution1233();
        String[] folders = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        solution1233.removeSubfolders(folders);
    }
}