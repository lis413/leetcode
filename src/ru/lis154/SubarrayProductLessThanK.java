package ru.lis154;

public class SubarrayProductLessThanK {

    public static void main(String[] args) {
        String s1= "abc";
        String s2 = "bcd";

        System.out.println(crypt("bcdz"));

    }

    private static String crypt(String str){
        char[] m = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : m){
            if (c == 'z'){
              sb.append('a');
            } else {
                sb.append((char) (c + 1));
            }
        }
        return sb.toString();
    }

}
