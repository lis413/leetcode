package ru.lis154;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                if (Math.abs((map.get(nums[i]) - i)) <= k) return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
