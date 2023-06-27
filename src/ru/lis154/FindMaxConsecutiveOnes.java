package ru.lis154;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int size  = 0;
        int prom = 0;

        for (int i : nums){
            if (i == 1){
                prom++;
            } else {
                if (prom >= size){
                    size = prom;
                }
                prom = 0;
            }
        }
        if (prom > size) return prom;
        return size;
    }
}
