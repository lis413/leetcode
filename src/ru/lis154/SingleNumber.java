package ru.lis154;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber2(new int[]{4,1,2,1,2,1}));
    }

    public static int singleNumber2(int[] nums) {
        // если встречается больше 2х раз
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }

    public static int singleNumber(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            boolean dublicat = set.remove(nums[i]);
            if (!dublicat) {
                set.add(nums[i]);
            }
        }

        int singleNum = set.iterator().next();

        return singleNum;
    }
}
