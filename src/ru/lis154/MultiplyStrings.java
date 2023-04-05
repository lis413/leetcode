package ru.lis154;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class MultiplyStrings {

    public static void main(String[] args) {
        System.out.println(multiply("401716832807512840963", "167141802233061013023557397451289113296441069"));
    }
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        System.out.println(getInt(num1));
        System.out.println(getInt(num2));
        return String.valueOf((getInt(num1).multiply(getInt(num2))));
    }

    private static BigInteger getInt(String num){
        Map<String, Integer> map = new HashMap<>();
        map.put("0", 0);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        String[] mas = num.split("");
        BigInteger rez = BigInteger.valueOf(0);
        for (int i = mas.length-1; i >= 0; i--){
            BigInteger t = BigInteger.valueOf(map.get(mas[mas.length-1-i]));
            BigInteger t2 = t.multiply(getSt(i));
            rez = rez.add(t2);
        }
        return rez;
    }
    static BigInteger getSt(int i){
        BigInteger bi = BigInteger.valueOf(1);
        for (int j = 0; j< i; j++){
            bi = bi.multiply(BigInteger.valueOf(10));
        }
        return bi;
    }
}
