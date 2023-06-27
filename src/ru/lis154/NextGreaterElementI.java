package ru.lis154;

import java.util.Arrays;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int num = 0;
        int[] rez = new int[nums1.length];
        if (nums1.length == 0) return rez;
        for (int i : nums1){
            for (int j = 0; j < nums2.length; j++){
                if (i == nums2[j]){
                    for (int k = j; k < nums2.length; k++){
                       if (nums2[k] > i){
                           rez[num] = nums2[k];
                           num++;
                           k = nums2.length;
                           j = nums2.length;
                       }
                    }
                }
                if (j == nums2.length-1) {
                    rez[num] = -1;
                    num++;
                }
            }
        }
        return rez;
    }

}
