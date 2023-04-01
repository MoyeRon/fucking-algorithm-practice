package dailytraining;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @name:
 * @link:
 * @author: taoyouwei
 * @date: 2023/3/29
 **/
public class Solution1574 {
    public int findLengthOfShortestSubarray(int[] arr) {
        Map<Integer, TreeSet<Integer>> positions = new TreeMap<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < arr.length; i++) {
            if (positions.containsKey(arr[i])) {
                positions.get(arr[i]).add(i);
            } else {
                TreeSet<Integer> pos = new TreeSet<>(((o1, o2) -> o2 - o1));
                pos.add(i);
                positions.put(arr[i], pos);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, TreeSet<Integer>> entry : positions.entrySet()) {
            TreeSet<Integer> pos = entry.getValue();
            for (Integer po : pos) {
                if (po == arr.length - 1) {
                    return result;
                } else {
                    result++;
                }
            }
        }
        return -1;
    }
}
