package ru.lis154;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        if (n == 1) return true;
        Set<Integer> set = new HashSet<>();
        while (true) {
            String dtr = String.valueOf(n);
            String[] mas = dtr.split("");
            int summ = 0;
            for (int i = 0; i < mas.length; i++) {
                summ += Math.pow(Integer.parseInt(mas[i]), 2);
            }
            if (summ == 1) return true;
            if (set.contains(summ)) return false;
            set.add(summ);
            n = summ;
        }
    }
}
