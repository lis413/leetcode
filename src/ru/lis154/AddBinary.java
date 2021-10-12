package ru.lis154;

import java.util.ArrayList;
import java.util.List;

public class AddBinary {


    public static String addBinary(String a, String b) {

        StringBuilder s1 = new StringBuilder(a).reverse();
        StringBuilder s2 = new StringBuilder(b).reverse();
        char[] mas1 = s1.toString().toCharArray();
        char[] mas2 = s2.toString().toCharArray();
        List<Character> resultList = new ArrayList<>();
        char zn = 0;
        if(mas1.length >= mas2.length){
            for (int i = 0; i < mas2.length; i++) {
                if (mas1[i] == 0){
                    if (mas2[i] == 0){
                        resultList.add(zn);
                        zn = 0;
                    }
                    if (mas2[i] == 1){

                    }
                }
            }
        }
        return "";
    }
}
