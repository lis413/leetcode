package ru.lis154;

import java.util.HashMap;
import java.util.Map;

public interface IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }
    public static String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        StringBuffer rez = new StringBuffer();
        // 1000
        int i1 = num/1000;
        if (i1 > 0){
            for (int i = 0; i < i1; i++) {
                rez.append(map.get(1000));
            }
            num = num - i1*1000;
        }
        int i2 = num / 100;
        if (i2 < 4) {
            for (int i = 0; i<i2; i++){
                rez.append(map.get(100));
            }
        } else if (i2 == 4) {
            rez.append(map.get(100)).append(map.get(500));
        } else if (i2 == 5) {
            rez.append(map.get(500));
        } else if (i2 < 9) {
            rez.append(map.get(500));
            for (int i = 5; i < i2; i++){
                rez.append(map.get(100));
            }
        } else {
            rez.append(map.get(100)).append(map.get(1000));
        }
        num = num - i2*100;
        int i3 = num / 10;
        if (i3 < 4) {
            for (int i = 0; i<i3; i++){
                rez.append(map.get(10));
            }
        } else if (i3 == 4) {
            rez.append(map.get(10)).append(map.get(50));
        } else if (i3 == 5) {
            rez.append(map.get(50));
        } else if (i3 < 9) {
            rez.append(map.get(50));
            for (int i = 5; i < i3; i++){
                rez.append(map.get(10));
            }
        } else {
            rez.append(map.get(10)).append(map.get(100));
        }
        num = num - i3*10;
        int i4 = num;
        if (i4 < 4) {
            for (int i = 0; i<i4; i++){
                rez.append(map.get(1));
            }
        } else if (i4 == 4) {
            rez.append(map.get(1)).append(map.get(5));
        } else if (i4 == 5) {
            rez.append(map.get(5));
        } else if (i4 < 9) {
            rez.append(map.get(5));
            for (int i = 5; i < i4; i++){
                rez.append(map.get(1));
            }
        } else {
            rez.append(map.get(1)).append(map.get(10));
        }
        return String.valueOf(rez);

    }
}
