package ru.lis154;

import java.util.HashMap;
import java.util.Map;

public class TitleToNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }
    public static int titleToNumber(String columnTitle) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] mas = s.split("");
        int i = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String symbol : mas){
            map.put(symbol, i);
            i++;
        }
        if (columnTitle.length() == 1) return map.get(columnTitle);
        String[] mapS = columnTitle.split("");
        int ch = 0;
        for (int j = 0; j < mapS.length-1; j++){
            ch += map.get(mapS[j]) * (int)Math.pow(26, mapS.length - 1 - j);
        }
        int rez = ch + map.get(mapS[mapS.length-1]);
        return rez;

    }
}
