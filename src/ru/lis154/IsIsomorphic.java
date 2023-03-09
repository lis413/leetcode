package ru.lis154;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class IsIsomorphic {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("egg", "add"));
    }
    public static boolean isIsomorphic(String s, String t) {
        char[] m2 = t.toCharArray();
        char[] m1 = s.toCharArray();
        Map<Character, Character> mapRez = new HashMap<>();
        for (int i = 0; i < m1.length; i++) {
            if (mapRez.containsKey(m1[i])) {
                if (!(m2[i] == (mapRez.get(m1[i]))))
                    return false;
            } else {
                if (mapRez.containsValue(m2[i])) return false;
                mapRez.put(m1[i], m2[i]);
            }
        }
        return true;
    }
}
