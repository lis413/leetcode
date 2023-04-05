package ru.lis154;

public class Sum3Closest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1,2,1,-4}, 1));
        System.out.println(threeSumClosest(new int[]{0,0,0}, 1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int min = nums[0] + nums[1] + nums[2];
        int sum;
        for (int i =0; i < nums.length-2; i++){
            for (int j = i+1; j < nums.length-1; j++){
                for (int k = j+1; k< nums.length; k++){
                    sum = nums[i] + nums[j]+nums[k];
                    if (sum - target == 0) return sum;
                    if (Math.abs(sum - target) < Math.abs(min-target)) min = sum;
                }
            }
        }
        return min;
    }
}
