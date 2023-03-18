package ru.lis154;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,8,12,25,57,89,122};
        int[] arr2 = new int[]{-1,0,3,5,9,12};

//        System.out.println(search(arr, 57));
//        System.out.println(search(arr2, 9));
        System.out.println(search(arr2, 2));
    }
    public  static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int sred;
        if (nums.length == 0) return -1;
        while (start <= end) {
            sred = (end + start) / 2;
            if (nums[sred] == target) {
                return sred;
            }
            if (nums[sred] > target) {
                end = sred - 1;
            } else {
                start = sred + 1;
            }
        }
        return -1;


    }
}
