package ru.lis154;

public class ReverseWords {

    public static void main(String[] args) {
       String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        String result = "";
        for (int i = 0; i < str.length; i++) {
            char[] mas = str[i].toCharArray();
            reverseString(mas);
            str[i] = new String(mas);
            if (i == str.length -1){
                result = result + str[i];
            } else {
                result = result + str[i] + " ";
            }

        }
        return result;
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
