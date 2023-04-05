package ru.lis154;

import java.math.BigInteger;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        System.out.println(xor);
        return Integer.bitCount(xor);
    }
}
