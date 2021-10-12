package ru.lis154;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CheckInclusion {

    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        String s3 = "ab", s4 = "eidboaoo";
        String s5 = "adc", s6 = "dcda";

        System.out.println(checkInclusion(s1, s2));
        System.out.println(checkInclusion(s3, s4));
        System.out.println(checkInclusion(s5, s6));
    }

    public static boolean checkInclusion(String s1, String s2) {

        List<Character> chars = returnList(s1);
        for (int i = 0; i <= s2.length()-chars.size(); i++) {
            List<Character> prob = returnList(s2.substring(i, i+chars.size()));
            System.out.println(prob);
            if (chars.equals(prob)) return true;
        }
        return false;
    }

    private static List<Character> returnList( String s ){
        List<Character> chars = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        Collections.sort(chars);
        return chars;
    }
}
