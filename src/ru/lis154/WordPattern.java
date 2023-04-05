package ru.lis154;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));

    }
    public static boolean wordPattern(String pattern, String s) {
        String[] masP = pattern.split("");
        String[] masS = s.split(" ");
        Map<String, Integer> mapV = new HashMap<>();
        if (masP.length != masS.length) return false;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < masP.length; i++){
            if (map.containsKey(masP[i])){
                if (!map.get(masP[i]).equals(masS[i])) return false;
            } else {
                if (mapV.containsKey(masS[i])) return false;
                mapV.put(masS[i], 1);
                map.put(masP[i], masS[i]);
            }
        }
        return true;
    }
}
