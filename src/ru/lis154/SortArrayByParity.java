package ru.lis154;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int chet = 0;
        int nechet = nums.length-1;
        int[] mas = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                mas[chet] = nums[i];
                chet++;
            } else {
                mas[nechet] = nums[i];
                nechet--;
            }
        }
        return mas;
    }
}
