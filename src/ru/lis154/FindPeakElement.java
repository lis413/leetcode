package ru.lis154;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2}));
    }
    public static int findPeakElement(int[] nums) {
        if (nums.length == 0) return -1;
      if(nums.length == 1) return 0;
        for (int i = 0; i < nums.length-1; i++){
            if (i == 0){
                if (nums[i] > nums[i+1]) return i;
            } else if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) return i;
            else {
                if (nums[i] > nums[i+1]) i++;
            }
        }
        if (nums.length >= 2 && nums[nums.length-2] < nums[nums.length-1]) return nums.length-1;
        return -1;
    }
}
