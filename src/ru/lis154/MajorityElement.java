package ru.lis154;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:  nums) {
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Integer max = 0;
        Integer el = 0;
        int t = 0;
        for (Map.Entry<Integer, Integer> elem : map.entrySet()){
            if (elem.getValue() > nums.length/2 && elem.getValue() > max){
                t++;
                el = elem.getKey();
                max = elem.getValue();
            }
        }
        if(t > 0) return el;
        return 0;
    }
}
