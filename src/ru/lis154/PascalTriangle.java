package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            if (i == 0) {
                List<Integer> l1 = new ArrayList<>();
                l1.add(1);
                list.add(l1);
            } else if (i == 1) {
                List<Integer> l2 = new ArrayList<>();
                l2.add(1);
                l2.add(1);
                list.add(l2);
            } else {
                List<Integer> l3 = new ArrayList<>();
                l3.add(1);
                for (int j = 1; j < i; j++){
                    l3.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
                l3.add(1);
                list.add(l3);
            }
        }
        return list;
    }
}
