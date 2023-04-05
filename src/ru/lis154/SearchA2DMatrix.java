package ru.lis154;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i<matrix.length; i++){
            if (matrix[i][matrix[i].length-1] >= target){
                return binarySearch(matrix[i], target) != -1;
            }
        }
        return false;
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
        return -1;
    }
}
