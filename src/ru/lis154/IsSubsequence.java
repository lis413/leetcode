package ru.lis154;

import java.util.List;

public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;
        char[] m1 = s.toCharArray();
        char[] m2 = t.toCharArray();
        int numberLastElement = 0;
        for (int i = 0; i < m2.length; i++){
            if (m1[numberLastElement] == m2[i]){
                numberLastElement++;
            }
            if (numberLastElement == m1.length) return true;
        }
        if (numberLastElement < m1.length) return false;
        return true;
    }

}
