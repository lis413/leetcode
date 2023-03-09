package ru.lis154;

import java.util.Iterator;
import java.util.Stack;

public class addBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11100", "110101"));
    }
    public static String addBinary(String a, String b) {
        String rez;
        Stack<String> st = new Stack<>();
        String bol;
        String min;
        if (a.length() > b.length()) {
           bol = a;
           min = b;
        } else {
            bol = b;
            min = a;
        }
        String[] s1 = bol.split("");
        String[] s2 = min.split("");
        int pr = 0;
        int prom = 0;
        for (int i = 1; i <= s1.length; i++) {
            int s1s = Integer.parseInt(s1[s1.length-i]);
            if (s2.length >= i) {
                int s2s = Integer.parseInt(s2[s2.length - i]);
                prom = s1s + s2s + pr;
            } else {
                prom = s1s + pr;
            }
            if (prom ==0){
                st.push("0");
                pr = 0;
            } else if (prom == 1){
                st.push("1");
                pr = 0;
            } else if (prom == 2) {
                st.push("0");
                pr = 1;
            } else if (prom == 3){
                st.push("1");
                pr = 1;
            }
        }
        if (pr == 1){
            st.push("1");
        }
        String rezult = "";
        System.out.println("The iterator values are: ");
        while (st.size() != 0) {
            rezult = rezult + st.pop();
        }
        return rezult;
    }
}
