package ru.lis154;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<String, Integer> map1 = getMap(s);
        Map<String, Integer> map2 = getMap(t);
        return map1.equals(map2);

    }
    Map<String, Integer> getMap(String s){
        Map<String, Integer> map = new HashMap<>();
        String[] str = s.split("");
        for (String st : str){
            if (!st.equals(" ")){
                if (map.containsKey(st)){
                    map.put(st, map.get(st)+ 1);
                } else {
                    map.put(st, 1);
                }
            }
        }
        return map;
    }
}
