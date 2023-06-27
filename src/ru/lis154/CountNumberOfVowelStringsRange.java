package ru.lis154;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfVowelStringsRange {

    public static void main(String[] args) {
        System.out.println(vowelStrings(new String[]{"are","amy","u"}, 0, 2));
    }
    public static int vowelStrings(String[] words, int left, int right) {
        int n = 0;
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("e");
        set.add("i");
        set.add("o");
        set.add("u");
        for (int i = left; i <= right; i++){
            String start = words[i].substring(0,1);
            String end = words[i].substring(words[i].length()-1);
            if (set.contains(start) && set.contains(end)) n++;
        }

        return n;
    }
}
