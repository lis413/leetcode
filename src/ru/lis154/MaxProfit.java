package ru.lis154;

public class MaxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
    public static int maxProfit(int[] prices) {
        if (prices.length == 1 || prices.length == 0) return 0;
        int min = prices[0];
        int rez = 0;
        for (int i = 1; i < prices.length; i++){
            int pred = prices[i] - min;
            if (pred > rez) rez = pred;
            if (min > prices[i]) min = prices[i];
        }
        if (rez > 0) return rez;
        else return 0;
    }
}
