package ru.lis154;

public class Yandex1 {
    public static void main(String[] args) {
       int i1 = m1("[1,2]");
      int i2 = m1("[2,5]");
      String rez = String.valueOf(i1+i2).replaceAll("", ",");
      String rez2 =   rez.substring(0, rez.length() - 1);
        String rez3 =   rez.substring(1, rez2.length());
        System.out.println("[" + rez3 + "]");
    }

    private static Integer m1(String str){
        String s = str.replaceAll("\\[|\\]|\\,", "");
        Integer i = Integer.parseInt(s);
        return i;
    }

}
