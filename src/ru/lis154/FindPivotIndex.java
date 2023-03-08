package ru.lis154;

import java.util.Arrays;

public class FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{-1,-1,-1,1,1,1}));
    }
    public static int pivotIndex(int[] nums) {
        int sumMax = Arrays.stream(nums).sum();
        int sumLeft = 0;
        if ((sumMax - nums[0]) == 0) return 0;
        for (int i = 1; i < nums.length; i++){
            sumLeft = sumLeft + nums[i-1];
            if (sumLeft == sumMax - nums[i] - sumLeft) return i;
        }
        return -1;
    }
}
