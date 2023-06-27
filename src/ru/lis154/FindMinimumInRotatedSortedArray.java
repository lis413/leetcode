package ru.lis154;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
    }
    public static int findMin(int[] nums) {
        return binarySearch(nums);
    }
    static int binarySearch(int[] sortedArray) {
        var left = 0;
        var right = sortedArray.length - 1;
        while (left < right) {
            var middle = left + (right - left) / 2;
            var current = sortedArray[middle];
            var currentLeft = sortedArray[right];
             if (current > currentLeft) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return sortedArray[left];
    }
}
