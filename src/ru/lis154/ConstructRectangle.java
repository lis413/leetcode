package ru.lis154;

public class ConstructRectangle {
    public static void main(String[] args) {
        int[] n = constructRectangle(6);
  //      System.out.println(constructRectangle(37));
    }
    public static int[] constructRectangle(int area) {
        int kor = (int) Math.sqrt(area);
        if (kor * kor == area) return new int[]{kor, kor};
        boolean t = true;
        int l = kor;
        while(t){
            l++;
            if (area % l == 0) return new int[]{l, area/l};
            if (l > area) t = false;
        }
        return new int[]{area, 1};

    }
}
