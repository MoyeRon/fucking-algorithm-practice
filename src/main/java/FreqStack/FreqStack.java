package FreqStack;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @name: 最大频率栈
 * @link: https://leetcode-cn.com/problems/maximum-frequency-stack/
 * @author: taoyouwei
 * @date: 2021/9/22
 **/
class FreqStack {

    private int maxFreq;
    private Map<Integer, Integer> val2FreqMap;
    private Map<Integer, Stack<Integer>> freq2ValMap;

    public FreqStack() {
        maxFreq = 0;
        val2FreqMap = new HashMap<>();
        freq2ValMap = new HashMap<>();
    }

    public void push(int val) {
        int freq = val2FreqMap.getOrDefault(val, 0) + 1;
        val2FreqMap.put(val, freq);
        freq2ValMap.putIfAbsent(freq, new Stack<>());
        freq2ValMap.get(freq).push(val);
        maxFreq = Math.max(maxFreq, freq);
    }

    public int pop() {
        Stack<Integer> vals = freq2ValMap.get(maxFreq);
        int v = vals.pop();
        int freq = val2FreqMap.get(v) - 1;
        val2FreqMap.put(v, freq);
        if (vals.isEmpty()) {
            maxFreq--;
        }
        return v;
    }
}
