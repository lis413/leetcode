package ru.lis154;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        double t = n;
        while (t >= 1){
            t = t / 3;
            if (t == 1) return true;
        }
        return false;
    }
}
