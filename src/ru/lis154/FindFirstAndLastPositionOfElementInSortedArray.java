package ru.lis154;

import java.util.TreeSet;

public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{1,2,3,3,3,3,4,5,9}, 3));
    }
    public static int[] searchRange(int[] nums, int target) {
        int number = binarySearch(nums, target);
        if (number == -1) return new int[]{-1,-1};
        int numberMin = number;
        int numberMax = number;
        boolean min = true;
        while (min){
            if (numberMin-1 >= 0) {
                if (nums[numberMin - 1] == target){
                    numberMin--;
                } else min = false;
            } else min = false;
        }


        boolean max = true;
        while (max){
            if (numberMax+1 < nums.length) {
                if (nums[numberMax + 1] == target){
                    numberMax++;
                } else max = false;
            } else max = false;
        }
        return new int[]{numberMin, numberMax};
    }
    static int binarySearch(int[] sortedArray, int element) {
        var left = 0;
        var right = sortedArray.length - 1;
        while (left <= right) {
            var middle = (left + right) / 2;
            var current = sortedArray[middle];

            if (current == element) {
                return middle;
            } else if (current < element) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        TreeSet<Integer> set;
        return -1;
    }

}
