package ru.lis154;

import java.util.HashSet;
import java.util.Set;

public class SubstringWithoutRepeat {

    public static void main(String[] args) {
        String s = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
      //  System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
       // System.out.println(lengthOfLongestSubstring(s4));
    }

    public static int lengthOfLongestSubstring(String s) {

        char[] mas = s.toCharArray();
        int lenghtMax = 0;

        for (int i = 0; i < mas.length; i++) {
            Set<Character> set = new HashSet<>();
            int middle = 0 ;
            for (int j = i; j < mas.length; j++) {
                if (set.contains(mas[j])) break;
                set.add(mas[j]);
                middle++;
            }
            if (lenghtMax < middle) lenghtMax = middle;

        }
        return lenghtMax;
    }
}
