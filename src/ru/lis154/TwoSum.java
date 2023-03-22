package ru.lis154;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15}, 9);
        twoSum(new int[]{3,2,4}, 6);
        twoSum(new int[]{3,3}, 6);

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i =0; i< nums.length; i++){
            int ch = target - nums[i];
            for (int j = i+1; j< nums.length; j++){
                if (nums[j] == ch)
                    return new int[]{i, j};
            }
        }
        Set<String>  set = new HashSet<>();
        return null;
    }
}
