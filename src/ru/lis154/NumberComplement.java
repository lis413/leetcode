package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
    public static int findComplement(int num) {
        List<String> listS = null;
        for (String s : listS){
            System.out.println("t");
        }
        String str = Integer. toBinaryString(num);
        String s1 = str.replaceAll("1", "2");
        String s2 = s1.replaceAll("0", "1");
        String s3 = s2.replaceAll("2", "0");
        System.out.println(s3);
        return Integer.parseInt(s3, 2);
    }
}
