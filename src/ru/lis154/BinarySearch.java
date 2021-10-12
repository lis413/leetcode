package ru.lis154;

public class BinarySearch {

    public static void main(String[] args) {
//        int index = search(new int[]{0, 4, 5, 8, 9, 55, 67, 98, 123, 333}, 67);
//        System.out.println(index);

        System.out.println(firstBadVersion(2));
    }
    public static int search(int[] nums, int target){
        int startindex = 0;
        int endIndex = nums.length - 1;

        while (startindex <= endIndex){
            int middleIndex = (startindex + endIndex) / 2;

            if (nums[middleIndex] == target) return middleIndex;
            else if (nums[middleIndex] < target){
                startindex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;

    }

    public static boolean isBadVersion(int version){
        if (version == 2)
        return true;
        else return false;
    }


    public static int indexGet(int[] nums, int target){
        int startindex = 0;
        int endIndex = nums.length - 1;
        int index = 0;
        while (startindex <= endIndex){
            int middleIndex = (startindex + endIndex) / 2;
            if (nums[middleIndex] == target) return middleIndex;
            else if (nums[middleIndex] < target){
                startindex = middleIndex + 1;
                index = middleIndex+1;
            } else {
                endIndex = middleIndex - 1;
                index = middleIndex -1;
            }
        }
        return index;
    }

}
