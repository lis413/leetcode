package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {

    public static void main(String[] args) {
        intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}}, new int[][]{{1,5},{8,12},{15,24},{25,26}});
    }
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();

        int[] mas = new int[firstList[firstList.length-1][1]];
        int[] mas2 = new int[secondList[secondList.length-1][1]];
            for (int j = 0; j < firstList.length; j++){
                for (int k = firstList[j][0]; k < firstList[j][1]; k++){
                    mas[k] = 1;
                }
            }
        for (int j = 0; j < secondList.length; j++){
            for (int k = secondList[j][0]; k < secondList[j][1]; k++){
                mas2[k] = 1;
            }
        }
        int start = 0;
        int end = 0;
        int lenght = mas.length < mas2.length ? mas.length : mas2.length;
        int[] rez = new int[lenght];
        for (int i = 0; i < mas.length; i++){
            if (mas[i] == 1 && mas2[i] == 1 ){
                rez[i] = 1;
            }
            if (i > 0 && mas[i] == 1 && mas2[i-1] ==1){
                rez[i] = 1;
            }
            if (i < mas.length-1 &&  mas[i] == 1 && mas2[i+1] == 1){
                rez[i+1] = 1;
            }
        }

        for (int i = 0; i < rez.length; i++){
            if (rez[i] == 1){
                start = i;
                while (i < rez.length && rez[i] == 1){
                    i++;
                }
                end = i+1;
                list.add(new int[]{start, end});
            }
        }

            return null;
    }
}
