package ru.lis154;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }
    public static String licenseKeyFormatting(String s, int k) {
        String[] mas = s.split("-");
        if (mas.length == 1) return mas[0].toUpperCase();
        StringBuilder rez = new StringBuilder();
        rez.append(mas[0]);
        StringBuilder pr = new StringBuilder();
        for (int i = 1; i < mas.length; i++){
            pr.append(mas[i].toUpperCase());
        }
        String stroka = pr.toString();
        while (stroka.length() > k){
            rez.append("-");
            rez.append(stroka.substring(0, k).toUpperCase());
            stroka = stroka.substring(k, stroka.length());
        }
        if (stroka.length() != 0){
            rez.append("-");
            rez.append(stroka.toUpperCase());
        }
        return rez.toString();
    }
}
