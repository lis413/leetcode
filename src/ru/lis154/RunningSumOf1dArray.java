package ru.lis154;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        if (nums.length == 0) return null;
        for (int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
