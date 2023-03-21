package ru.lis154;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
    public static int uniquePaths(int m, int n) {
        int[][] mas = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int s = 0;
                if (i-1 >= 0){
                   s = s + mas[i-1][j];
                }
                if (j - 1 >= 0){
                    s = s + mas[i][j-1];
                }
                if (i-1 < 0 && j-1 < 0) s = 1;
                mas[i][j] = s;
            }
        }
        return mas[m-1][n-1];
    }
}
