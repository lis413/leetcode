package ru.lis154;

import java.util.*;

public class FindWords {
    public static void main(String[] args) {
        findWords(new String[]{"adsdf","sfd"});
    }
    public static String[] findWords(String[] words) {
        List<Set<String>> list = new ArrayList<>();
        Set<String> set1 = new HashSet<>(Arrays.asList( "QWERTYUIOP".split("")));
        Set<String> set2 = new HashSet<>(Arrays.asList( "ASDFGHJKL".split("")));
        Set<String> set3 = new HashSet<>(Arrays.asList( "ZXCVBNM".split("")));
        list.add(set1);
        list.add(set2);
        list.add(set3);
        List<String> result = new ArrayList<>();
        for (String word : words){
            boolean st = true;
            Set<String> r = new HashSet<>();
            for (Set<String> set : list){
                if (set.contains(word.substring(0,1).toUpperCase())){
                    r = set;
                }
            }
            for (String s : word.split("")){
               if (!r.contains(s.toUpperCase())){
                    st = false;
                   break;
               }
            }
            if (st) result.add(word);
        }
        return result.toArray(new String[0]);
    }
}
