package contest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2022/3/19
 **/
public class Solution6022 {
    public int halveArray(int[] nums) {
        double currentSum = 0;
        for (int num : nums) {
            currentSum += num;
        }
        double target = currentSum / 2;
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            priorityQueue.add((double) num);
        }
        int count = 0;
        while (currentSum - target > 0.000001) {
            double max = priorityQueue.poll();
            double divide = max / 2;
            currentSum -= divide;
            priorityQueue.add(divide);
            count++;
        }
        return count;
    }
}
