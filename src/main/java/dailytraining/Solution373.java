package dailytraining;


import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @name: 查找和最小的 K 对数字
 * @link: https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/
 * @author: taoyouwei
 * @date: 2022/1/14
 **/
public class Solution373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(k, (o1, o2) -> {
            return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
        });
        List<List<Integer>> results = new LinkedList<>();
        int m = nums1.length;
        int n = nums2.length;
        for (int i = 0; i < Math.min(m, k); i++) {
            priorityQueue.add(new int[]{i, 0});
        }
        while (k-- > 0 && !priorityQueue.isEmpty()) {
            int[] index = priorityQueue.poll();
            List<Integer> list = new LinkedList<>();
            list.add(nums1[index[0]]);
            list.add(nums2[index[1]]);
            results.add(list);
            if (index[1] + 1 < n) {
                priorityQueue.add(new int[]{index[0], index[1] + 1});
            }
        }
        return results;
    }
}
