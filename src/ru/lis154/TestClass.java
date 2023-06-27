package ru.lis154;

import java.util.HashMap;
import java.util.Map;

public class TestClass {
    public static void main(String[] args) {
        // Найти первый не повторяющийся элемент в массиве целых чисел
        int[] arr = {};
        System.out.println(getEl(arr));
    }

    private static int getEl (int[] arr){
     //   int[] arr = {9, 4, 9, 6, 7, 4, 5};
        if (arr.length == 0) return -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int el : arr){
            if (map.get(el) == 1) return el;
        }
        return-1;
    }

}
