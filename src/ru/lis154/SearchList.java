package ru.lis154;

import java.util.LinkedList;
import java.util.List;

public class SearchList {

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    public static Integer[] getArrayIndex(int arr[], int index) {
        List<Integer> list = new LinkedList<>();
        if (index == -1) return new Integer[]{-1};
        list.add(index);
        if (index - 1 >= 0) {
            int ch = arr[index - 1];
            int i = 1;
            while (index - i >= 0 && ch == arr[index]) {

                list.add(0, index - i);
                i++;
                if (index - i >= 0) {
                    ch = arr[index - i];
                }

            }
        }

        if (index + 1 < arr.length) {
            int ch2 = arr[index + 1];
            int i = 1;
            while (index + i < arr.length && ch2 == arr[index]) {

                list.add(index + i);
                i++;
                if (index + i < arr.length) {
                    ch2 = arr[index + i];
                }
            }
        }
        Integer[] mass = new Integer[list.size()];
        int i = 0;
        for (Integer l: list) {
            System.out.println("l = " + l);
            mass[i] = l;
            i++;
        }
        System.out.println("mass = " + mass.toString());
        return mass;
    }
}
