package ru.lis154;

import java.util.Stack;

public class BackspaceCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
        System.out.println(backspaceCompare("ab##","c#d#"));
        System.out.println(backspaceCompare("a#c","b"));

    }
    public static  boolean backspaceCompare(String s, String t) {
        String str1 = returnStr(s);
        String str2 = returnStr(t);
        return str1.equals(str2);
    }

    private static String  returnStr(String s){
        char[] mass = s.toCharArray();
        Stack<Character> stak = new Stack<>();
        for (char c : mass){
            if (c != '#'){
                stak.push(c);
            } else if (stak.empty()){
                stak.pop();
            }
        }
        return stak.toString();
    }
}
