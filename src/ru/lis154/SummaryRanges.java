package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        summaryRanges(new int[]{-2147483648,-2147483647,2147483647});
    }
    public static List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        Integer start = null;
        Integer end = null;
        for (int i = 0; i < nums.length; i++){
            if (start == null) {
                start = nums[i];
            }
            if (i+1 < nums.length){
                if (nums[i+1] - nums[i] != 1) {
                    end = nums[i];
                    if (start != null && !start.equals(end)) {
                        list.add(start + "->" + end);
                    } else if (start != null){
                        list.add(start.toString());
                    }
                    start = null;
                    end = null;
                }
            } else {
                end = nums[i];
            }
        } if (start != null && !start.equals(end)) {
            list.add(start + "->" + end);
        } else if (start != null){
            list.add(start.toString());
        }

        return list;
    }

}
