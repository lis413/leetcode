package ru.lis154;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1}));
    }

    public static int missingNumber(int[] nums) {
        if (nums.length == 1 && nums[0] == 0) return 1;
        if (nums.length == 1 && nums[0] == 1) return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int p = set.pollFirst();
        if (p != 0) return 0;
        for (int t : set) {
            if (t != p) {
                if (p + 1 != t) return p + 1;
            }
            p = t;
        }
        return p + 1;
    }

    public int missingNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                continue;
            } else return i;
        }
        return 0;
    }
}
