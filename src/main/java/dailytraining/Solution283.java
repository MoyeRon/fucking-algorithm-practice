package dailytraining;

import java.util.Arrays;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/9/5
 **/
public class Solution283 {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int notZero = 1;
        int nextZero = 0;
        while (notZero < nums.length) {
            if (nums[notZero] != 0 && nums[nextZero] == 0) {
                int temp = nums[notZero];
                nums[notZero] = nums[nextZero];
                nums[nextZero] = temp;
                notZero++;
                nextZero++;
            }else if (nums[notZero]==0&&nums[nextZero] == 0){
                notZero++;
            }else if (nums[notZero]!=0&&nums[nextZero]!=0){
                notZero++;
                nextZero++;
            }else {
                notZero++;
                nextZero++;
            }
        }
    }
}
