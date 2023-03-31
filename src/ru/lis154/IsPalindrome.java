package ru.lis154;

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "").toLowerCase();
        String str2 =  new StringBuilder(str).reverse().toString();
        return str.equals(str2);
    }
}
