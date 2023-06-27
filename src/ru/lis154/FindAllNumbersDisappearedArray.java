package ru.lis154;

import java.sql.Array;
import java.util.*;

public class FindAllNumbersDisappearedArray {

    public static void main(String[] args) {

        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> rez = new ArrayList<>();
        for (int i : nums){
            set.add(i);
        }
        if (set.size() == 1 && nums[0] == 1){
            rez.add(2);
            return rez;
        } else if(set.size() == 1 && nums[0] == 2){
            rez.add(1);
            return rez;
        }
        List<Integer> arr = new ArrayList<>(set);
        int i = 0;
        int j = arr.get(0);
        while (i < arr.size()){
            if (j != arr.get(i)){
                rez.add(j);
                j++;
            } else {
                i++;
                j++;
            }
        }
        return rez;

    }
}
