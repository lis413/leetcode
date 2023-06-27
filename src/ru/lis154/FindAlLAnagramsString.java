package ru.lis154;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAlLAnagramsString {

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));

    }
    public static List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) return null;

        List<Integer> list = new ArrayList<>();
        String[] sm = s.split("");
        String[] find = p.split("");
        Map<String, Integer> mapF = new HashMap<>();
        int count = find.length;
        for (int i = 0; i < count; i++){
            if (mapF.containsKey(find[i])){
                mapF.put(find[i],mapF.get(find[i])+1);
            } else {
                mapF.put(find[i], 1);
            }
        }
        Map<String, Integer> map = getMap(sm, count, 0);
        if (map.equals(mapF)) list.add(0);
        for (int i = 1; i < sm.length - count+1; i++){
            if (map.get(sm[i-1]) > 1) map.put(sm[i-1], map.get(sm[i-1])-1); else map.remove(sm[i-1]);
            if (map.containsKey(sm[i+count-1])) map.put(sm[i+count-1], map.get(sm[i+count-1])+1); else map.put(sm[i+count-1], 1);
            if (map.equals(mapF)){
                list.add(i);
            }
            System.out.println(i);
        }
        return list;
    }

    private static Map<String, Integer> getMap(String[] find, int count, int start){
        Map<String, Integer> mapF = new HashMap<>();
        for (int i = start; i < start+count; i++){
            if (mapF.containsKey(find[i])){
                mapF.put(find[i],mapF.get(find[i])+1);
            } else {
                mapF.put(find[i], 1);
            }
        }
        return mapF;
    }
}
