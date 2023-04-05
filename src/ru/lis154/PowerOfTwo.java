package ru.lis154;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        double t = n;
        while (t >= 1){
            t = t / 2;
            if (t == 1) return true;
        }
        return false;
    }
}
