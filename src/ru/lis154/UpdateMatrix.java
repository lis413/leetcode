package ru.lis154;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UpdateMatrix {

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dp = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    dp[i][j] = 0;
                    q.add(new int[]{i, j});
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while(!q.isEmpty()) {
            int[] current = q.remove();
            for(int[] point: getNeighbors(current[0], current[1], n, m)) {
                if (dp[point[0]][point[1]] > dp[current[0]][current[1]] + 1) {
                    dp[point[0]][point[1]] = dp[current[0]][current[1]] + 1;
                    q.add(new int[]{point[0], point[1]});
                }
            }
        }
        return dp;
    }

    private List<int[]> getNeighbors(int row, int col, int n, int m) {
        List<int[]> list = new LinkedList<>();
        if (row+1 < n) list.add(new int[]{row+1, col});
        if (row-1 >= 0) list.add(new int[]{row-1, col});
        if (col+1 < m) list.add(new int[]{row, col+1});
        if (col-1 >= 0) list.add(new int[]{row, col-1});
        return list;
    }


}
