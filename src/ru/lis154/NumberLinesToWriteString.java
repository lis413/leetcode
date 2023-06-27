package ru.lis154;



public class NumberLinesToWriteString {
    public static void main(String[] args) {
        numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
    }
    public static int[] numberOfLines(int[] widths, String s) {
        int[] mas = new int[2];
        char[] spisok = s.toCharArray();
        System.out.println((int)'a');
        System.out.println((int)'z');
        int rez = 0;
        for (int i =0; i < spisok.length; i++){
            if (rez + widths[(int)spisok[i]-97] > 100){
                rez = widths[(int)spisok[i]-97];
                mas[0]++;
            } else {
                rez+=widths[(int)spisok[i]-97];
            }
        }
        mas[0]++;
        mas[1] = rez;
        return mas;
    }
}
