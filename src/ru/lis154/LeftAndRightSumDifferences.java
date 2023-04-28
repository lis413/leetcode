package ru.lis154;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        leftRigthDifference(new int[]{10,4,8,3});
    }
    public static int[] leftRigthDifference(int[] nums) {
        if (nums.length == 0) return new int[0];
        int sum = 0;
        for (int s: nums){
            sum = sum + s;
        }
        int sumLeft = 0;
        int[] rez = new int[nums.length];
        rez[0] = Math.abs(sum - nums[0]);
        for (int i = 1; i < nums.length-1; i++){
            sumLeft = sumLeft + nums[i-1];
            rez[i] = Math.abs(sumLeft - (sum - sumLeft - nums[i]));
        }
        rez[nums.length - 1] =  Math.abs(sum - nums[nums.length-1]);
        return rez;
    }
}
