package dailytraining;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/4/13
 **/
public class Solution2404 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> times = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                times.put(num, times.getOrDefault(num, 0) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entry = new ArrayList<>(times.entrySet());
        entry.sort((o1, o2) -> {
            if (o1.getValue() != o2.getValue()) {
                return o2.getValue() - o1.getValue();
            } else {
                return o1.getKey() - o2.getKey();
            }
        });
        return entry.isEmpty() ? -1 : entry.get(0).getKey();
    }
}
