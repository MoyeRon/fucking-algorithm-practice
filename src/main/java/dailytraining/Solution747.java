package dailytraining;


public class Solution747 {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int max = -1;
        int pos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                pos = i;
            }
        }
        for (int num : nums) {
            if (num == max) {
                continue;
            }
            if (num * 2 > max) {
                return -1;
            }
        }
        return pos;
    }
}
