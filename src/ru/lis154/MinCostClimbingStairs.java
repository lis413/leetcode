package ru.lis154;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] mas = new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(mas));
    }
    public static int minCostClimbingStairs2(int[] cost) {

        int summ = 0;
        if (cost.length == 0) return 0;
        if (cost.length == 1) return cost[0];
        int n =0;
        if (cost[0] > cost[1]) n = 1;
        for (int i = n; i < cost.length-1; i++){
            if (cost[i] >= cost[i+1] && (i+1) < cost.length){
                summ = summ + cost[i+1];
                i++;
            } else {
                summ =summ + cost[i];
            }
        }
        return summ;
    }

    public static int minCostClimbingStairs(int[] cost) {
        for(int i=2;i<cost.length;i++)
            cost[i] = Math.min(cost[i-1],cost[i-2])+cost[i];
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}
