package ru.lis154;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void reverseString(char[] s) {
        //if (s.length %2 == 0){
            for (int i = 0; i < s.length/2; i++) {
                char prom = s[i];
                s[i] = s[s.length-i-1];
                s[s.length-i-1] = prom;
            }
       // }
    }
}
